package uk.ac.ed.inf.ilp.constant;

/**
 * error reason codes for an invalid order
 */
public final class InvalidOrderReasonCodes {
    /**
     * undefined error
     */
    public static final int UNDEFINED = 0;

    /**
     * the card number is incorrect
     */
    public static final int CARD_NUMBER = 1;

    /**
     * expiry date problem
     */
    public static final int EXPIRY_DATE = 2;

    /**
     * CVC is wrong
     */
    public static final int CVC = 3;

    /**
     * order total is wrong
     */
    public static final int TOTAL = 4;

    /**
     * a pizza in the order is undefined
     */
    public static final int PIZZA_NOT_DEFINED = 5;

    /**
     * too many pizzas ordered
     */
    public static final int MAX_PIZZA_COUNT_EXCEEDED = 6;

    /**
     * pizzas were ordered from multiple restaurants
     */
    public static final int MULTIPLE_RESTAURANTS = 7;

    /**
     * the restaurant is closed on the order day
     */
    public static final int RESTAURANT_CLOSED = 7;
}
