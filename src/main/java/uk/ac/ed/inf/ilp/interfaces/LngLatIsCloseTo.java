package uk.ac.ed.inf.ilp.interfaces;

import uk.ac.ed.inf.ilp.data.LngLat;

/**
 * implement @isCloseTo for a position
 */
public interface LngLatIsCloseTo {
    /**
     * check if two positions are close (<= than SystemConstants.DRONE_IS_CLOSE_DISTANCE)
     * @param startPosition is the starting position
     * @param otherPosition is the position to check
     * @return if the positions are close
     */
    boolean isCloseTo(LngLat startPosition, LngLat otherPosition);
}
