package uk.ac.ed.inf.ilp.interfaces;

import uk.ac.ed.inf.ilp.data.Order;

/**
 * interface to validate an order
 */
public interface OrderValidation {
    /**
     * validate an order an deliver a validated version
     * @param orderToValidate is the order which needs validation
     * @return the validated order
     */
    Order validateOrder(Order orderToValidate);
}
