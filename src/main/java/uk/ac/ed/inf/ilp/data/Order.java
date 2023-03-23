package uk.ac.ed.inf.ilp.data;

import uk.ac.ed.inf.ilp.constant.InvalidOrderReasonCodes;
import uk.ac.ed.inf.ilp.constant.OrderStatus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * defines an order in the PizzaDronz service
 */
public final class Order {
    private String orderNo = "";
    private LocalDate orderDeliveryDate = LocalDate.MIN;
    private OrderStatus orderStatus = OrderStatus.UNDEFINED;
    private int statusReasonCode = InvalidOrderReasonCodes.NO_ERROR;
    private String customer = "";
    private String creditCardNumber = "";
    private String creditCardExpiry = "";
    private String cvv = "";
    private int priceTotalInPence = 0;
    private Pizza[] pizzasInOrder = new Pizza[0];


    /**
     * full constructor for an order
     * @param orderNo the number
     * @param orderDeliveryDate is when the order is due (to be delivered)
     * @param orderStatus is the status
     * @param statusReasonCode is a reason code for the status (extended explanation)
     * @param customer is who ordered the pizzas
     * @param creditCardNumber is the CC to be used (16 digit versions only)
     * @param creditCardExpiry is when the card expires
     * @param cvv is the CVV of the card
     * @param priceTotalInPence is the total price of the order
     * @param pizzasInOrder is the list of pizzas in the order
     */
    public Order(String orderNo, LocalDate orderDeliveryDate, OrderStatus orderStatus, int statusReasonCode, String customer, String creditCardNumber, String creditCardExpiry, String cvv, int priceTotalInPence, Pizza[] pizzasInOrder) {
        this(orderNo, orderDeliveryDate, customer, creditCardNumber, creditCardExpiry, cvv, priceTotalInPence, pizzasInOrder);

        this.setOrderStatus(orderStatus);
        this.setStatusReasonCode(statusReasonCode);
    }

    /**
     * full constructor for an order
     * @param orderNo the number
     * @param orderDeliveryDate is when the order is due (to be delivered)
     * @param customer is who ordered the pizzas
     * @param creditCardNumber is the CC to be used (16 digit versions only)
     * @param creditCardExpiry is when the card expires
     * @param cvv is the CVV of the card
     * @param priceTotalInPence is the total price of the order
     * @param pizzasInOrder is the list of pizzas in the order
     */
    public Order(String orderNo, LocalDate orderDeliveryDate, String customer, String creditCardNumber, String creditCardExpiry, String cvv, int priceTotalInPence, Pizza[] pizzasInOrder) {
        this.setOrderNo(orderNo);
        this.setOrderDate(orderDeliveryDate);
        this.setCustomer(customer);
        this.setCreditCardNumber(creditCardNumber);
        this.setCreditCardExpiry(creditCardExpiry);
        this.setCvv(cvv);
        this.setPriceTotalInPence(priceTotalInPence);
        this.setPizzasInOrder(pizzasInOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderNo(), getOrderDate(), getOrderStatus(), getStatusReasonCode(), getCustomer(), getCreditCardNumber(), getCreditCardExpiry(), getCvv(), getPriceTotalInPence(), Arrays.hashCode(getPizzasInOrder()));
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDeliveryDate;
    }

    public void setOrderDate(LocalDate orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getStatusReasonCode() {
        return statusReasonCode;
    }

    public void setStatusReasonCode(int statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardExpiry() {
        return creditCardExpiry;
    }

    public void setCreditCardExpiry(String creditCardExpiry) {
        this.creditCardExpiry = creditCardExpiry;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public int getPriceTotalInPence() {
        return priceTotalInPence;
    }

    public void setPriceTotalInPence(int priceTotalInPence) {
        this.priceTotalInPence = priceTotalInPence;
    }

    public Pizza[] getPizzasInOrder() {
        return pizzasInOrder;
    }

    public void setPizzasInOrder(Pizza[] pizzasInOrder) {
        this.pizzasInOrder = pizzasInOrder;
    }
}
