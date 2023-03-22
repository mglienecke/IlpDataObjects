package uk.ac.ed.inf.ilp.interfaces;

import uk.ac.ed.inf.ilp.constant.SystemConstants;
import uk.ac.ed.inf.ilp.data.LngLat;
import uk.ac.ed.inf.ilp.data.NamedRegion;

/**
 * implement @distanceTo for a position
 */
public interface LngLatDistanceTo {
    /**
     * get the distance between two positions
     * @param startPosition is where the start is
     * @param endPosition is where the end is
     * @return the euclidean distance between the positions
     */
    double distanceTo(LngLat startPosition, LngLat endPosition);
}
