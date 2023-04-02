package uk.ac.ed.inf.ilp.constant;

/**
 * error reason codes for an invalid order
 */
public enum InvalidOrderReasonCode {
    /**
     * no error present
     */
    NO_ERROR,

    /**
     * the card number is incorrect
     */
    CARD_NUMBER,

    /**
     * expiry date problem
     */
    EXPIRY_DATE,

    /**
     * CVC is wrong
     */
    CVV,

    /**
     * order total is wrong
     */
    TOTAL,

    /**
     * a pizza in the order is undefined
     */
    PIZZA_NOT_DEFINED,

    /**
     * too many pizzas ordered
     */
    MAX_PIZZA_COUNT_EXCEEDED,

    /**
     * pizzas were ordered from multiple restaurants
     */
    MULTIPLE_RESTAURANTS,

    /**
     * the restaurant is closed on the order day
     */
    RESTAURANT_CLOSED
}
