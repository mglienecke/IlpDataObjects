package uk.ac.ed.inf.ilp.constant;

/**
 * error reason codes for an invalid order
 */
public enum OrderValidationCode {
    /**
     * the reason code is undefined
     */
    UNDEFINED,

    /**
     * no error present
     */
    NO_ERROR,

    /**
     * the card number is incorrect
     */
    CARD_NUMBER_INVALID,

    /**
     * expiry date problem
     */
    EXPIRY_DATE_INVALID,

    /**
     * CVC is wrong
     */
    CVV_INVALID,

    /**
     * order total is incorrect
     */
    TOTAL_INCORRECT,

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
    PIZZA_FROM_MULTIPLE_RESTAURANTS,

    /**
     * the restaurant is closed on the order day
     */
    RESTAURANT_CLOSED,

    /**
     * a pizza was ordered with an invalid price
     */
    PRICE_FOR_PIZZA_INVALID,

    /**
     * the order contains no pizzas
     */
    EMPTY_ORDER
}
