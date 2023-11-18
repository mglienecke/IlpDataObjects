package uk.ac.ed.inf.ilp.interfaces;

import uk.ac.ed.inf.ilp.constant.SystemConstants;
import uk.ac.ed.inf.ilp.data.LngLat;
import uk.ac.ed.inf.ilp.data.NamedRegion;

/**
 * implement the needed computations for a LngLat
 */
public interface LngLatHandling {
    /**
     * get the distance between two positions
     * @param startPosition is where the start is
     * @param endPosition is where the end is
     * @return the euclidean distance between the positions
     */
    double distanceTo(LngLat startPosition, LngLat endPosition);

    /**
     * check if two positions are close (< than SystemConstants.DRONE_IS_CLOSE_DISTANCE)
     * @param startPosition is the starting position
     * @param otherPosition is the position to check
     * @return if the positions are close
     */
    boolean isCloseTo(LngLat startPosition, LngLat otherPosition);

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
        if (!centralArea.name().equals(SystemConstants.CENTRAL_REGION_NAME)) {
            throw new IllegalArgumentException("the named region: " + centralArea.name() + " is not valid - must be: " + SystemConstants.CENTRAL_REGION_NAME);
        }

        return isInRegion(point, centralArea);
    }

    /**
     * check if the @position is in the @region (includes the border)
     * @param position to check
     * @param region as a closed polygon
     * @return if the position is inside the region (including the border)
     */
    boolean isInRegion(LngLat position, NamedRegion region);

    /**
     * find the next position if an @angle is applied to a @startPosition
     * @param startPosition is where the start is
     * @param angle is the angle to use in degrees
     * @return the new position after the angle is used
     */
    LngLat nextPosition(LngLat startPosition, double angle);
}
