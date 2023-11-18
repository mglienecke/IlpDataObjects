package uk.ac.ed.inf.ilp.constant;

/**
 *
 */
public final class SystemConstants {

    /**
     * the charge for any order
     */
    public static final int ORDER_CHARGE_IN_PENCE = 100;

    /**
     * the maximum number of pizzas in one order
     */
    public static final int MAX_PIZZAS_PER_ORDER = 4;

    /**
     * the distance a drone can move in 1 iteration
     */
    public static final double DRONE_MOVE_DISTANCE = 0.00015;

    /**
     * the distance which is considered "close"
     */
    public static final double DRONE_IS_CLOSE_DISTANCE = 0.00015;

    /**
     * the maximum moves a drone can make before running out of battery
     */
    public static final int DRONE_MAX_MOVES = 2000;

    /**
     * the central region name
     */
    public static final String CENTRAL_REGION_NAME = "central";

    /**
     * Longitude AT
     */
    public static final double APPLETON_LNG = -3.186874;

    /**
     * Latitude AT
     */
    public static final double APPLETON_LAT = 55.944494;

}
