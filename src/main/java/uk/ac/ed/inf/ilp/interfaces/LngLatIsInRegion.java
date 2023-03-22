package uk.ac.ed.inf.ilp.interfaces;

import uk.ac.ed.inf.ilp.constant.SystemConstants;
import uk.ac.ed.inf.ilp.data.LngLat;
import uk.ac.ed.inf.ilp.data.NamedRegion;

/**
 * interface for @isInRegion for a position
 */
public interface LngLatIsInRegion {
    /**
     * check if the @position is in the @region (includes the border)
     * @param position to check
     * @param region as a closed polygon
     * @return if the position is inside the region (including the border)
     */
    boolean isInRegion(LngLat position, NamedRegion region);
}
