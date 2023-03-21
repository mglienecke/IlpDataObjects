package uk.ac.ed.inf.ilp.data.core;

/**
 *
 * @param lng
 * @param lat
 */
public record LngLat(double lng, double lat) {
    /**
     * tolerance is 1 at the end to compensate for rounding errors
     */
    public static final double TOLERANCE = 0.00015;
    public static final double MOVE_DISTANCE = 0.00015;

    public static boolean isInArea(LngLat point, LngLat[] area) {
        boolean odd = false;

        for (int i = 0, j = area.length - 1; i < area.length; i++) {

            if (((area[i].lat() > point.lat()) != (area[j].lat() > point.lat())) && (point.lng() <
                    (area[j].lng() - area[i].lng()) * (point.lat() - area[i].lat()) / (area[j].lat()
                            - area[i].lat()) + area[i].lng())) {
                odd = !odd;
            }
            j = i;
        }

        return odd;
    }

    public boolean inCentralArea(LngLat[] centralAreaPoints) {
        return isInArea(this, centralAreaPoints);
    }

    public double distanceTo(LngLat other) {
        var d1 = this.lng() - other.lng();
        var d2 = this.lat() - other.lat();
        return Math.sqrt(d1 * d1 + d2 * d2);
    }

    public boolean isCloseTo(LngLat other) {
        return this.distanceTo(other) <= LngLat.TOLERANCE;
    }

    /**
     * https://www.wyzant.com/resources/answers/601887/calculate-point-given-x-y-angle-and-distance or https://math.stackexchange.com/questions/143932/calculate-point-given-x-y-angle-and-distance
     * @param angle
     * @return
     */
    public LngLat nextPosition(double angle) {
        return new LngLat(this.lng() + LngLat.MOVE_DISTANCE * Math.cos(Math.toRadians(angle)),
                this.lat() + LngLat.MOVE_DISTANCE * Math.sin(Math.toRadians(angle)));
    }
}
