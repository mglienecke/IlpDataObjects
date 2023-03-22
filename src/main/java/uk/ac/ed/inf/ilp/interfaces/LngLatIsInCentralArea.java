package uk.ac.ed.inf.ilp.interfaces;

import uk.ac.ed.inf.ilp.constant.SystemConstants;
import uk.ac.ed.inf.ilp.data.LngLat;
import uk.ac.ed.inf.ilp.data.NamedRegion;
import uk.ac.ed.inf.ilp.interfaces.LngLatIsInRegion;

/**
 * interface for implementing the @isInCentralArea check. The default implementation just does some extra checking and then relies on the base interface for the implementation
 */
public interface LngLatIsInCentralArea extends LngLatIsInRegion {
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
}
