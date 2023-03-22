package uk.ac.ed.inf.ilp.data.interfaces;

import uk.ac.ed.inf.ilp.data.constant.SystemConstants;
import uk.ac.ed.inf.ilp.data.core.LngLat;
import uk.ac.ed.inf.ilp.data.core.NamedRegion;

public interface LngLatHandlerInterface {
    /**
     * check if the @point is in the @region
     * @param point to check
     * @param region as a closed polygon
     * @return if the point is in the region
     */
    boolean isInRegion(LngLat point, NamedRegion region);

    /**
     * special handling shortcut for the central area. Here an implementation might add special improved processing as the central region is always rectangular
     * @param point to be checked
     * @param centralArea the central area
     * @return if the point is in the central area
     */
    default boolean isInCentralArea(LngLat point, NamedRegion centralArea) {
        if (centralArea == null){
            throw new IllegalArgumentException("the named region is null");
        }
        if (centralArea.name().equals(SystemConstants.CENTRAL_AREA_NAME) == false) {
            throw new IllegalArgumentException("the named region: " + centralArea.name() + " is not valid - must be: " + SystemConstants.CENTRAL_AREA_NAME);
        }

        return isInRegion(point, centralArea);
    }

    double distanceTo(LngLat currentPosition, LngLat endPosition);

    boolean isCloseTo(LngLat currentPosition, LngLat otherPosition);

    LngLat nextPosition(LngLat currentPosition, double angle);
}
