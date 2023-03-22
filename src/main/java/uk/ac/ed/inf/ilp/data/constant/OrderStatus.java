package uk.ac.ed.inf.ilp.data.constant;

/**
 * the status an order can have
 */
public enum OrderStatus {
    /**
     * it was delivered
     */
    DELIVERED,

    /**
     * it is invalid
     */
    INVALID,

    /**
     * the state is currently undefined
     */
    UNDEFINED,

    /**
     * the order is valid as such, yet has not been delivered
     */
    VALID_BUT_NOT_DELIVERED
}
