package uk.ac.ed.inf.ilp.interfaces;

import uk.ac.ed.inf.ilp.constant.SystemConstants;
import uk.ac.ed.inf.ilp.data.LngLat;
import uk.ac.ed.inf.ilp.data.NamedRegion;

/**
 * interface for @nextPosition for a position and an angle
 */
public interface LngLatNextPosition {
    /**
     * find the next position if an @angle is applied to a @startPosition
     * @param startPosition is where the start is
     * @param angle is the angle to use
     * @return the new position after the angle is used
     */
    LngLat nextPosition(LngLat startPosition, double angle);
}
