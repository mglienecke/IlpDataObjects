package uk.ac.ed.inf.ilp.data.core;

/**
 * defines an order which is available in the system
 */
public class Order {
    /**
     * the charge for any order
     */
    public static final int OrderChargeInPence = 100;

    public String orderNo;
    public String orderDate;
    public String customer;
    public String creditCardNumber;
    public String creditCardExpiry;
    public String cvv;
    public int priceTotalInPence;

    public String[] orderItems;


    /**
     * Constructor for mapping
     */
    public Order(String orderNo, String orderDate, String customer, String creditCardNumber, String creditCardExpiry, String cvv, int priceTotalInPence, String[] orderItems) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.customer = customer;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiry = creditCardExpiry;
        this.cvv = cvv;
        this.priceTotalInPence = priceTotalInPence;
        this.orderItems = orderItems;
    }


    /**
     * Default constructor for deserialization
     */
    public Order() {

    }
}
