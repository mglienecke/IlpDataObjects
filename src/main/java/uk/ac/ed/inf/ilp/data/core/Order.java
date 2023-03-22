package uk.ac.ed.inf.ilp.data.core;

import uk.ac.ed.inf.ilp.data.constant.InvalidOrderReasonCodes;
import uk.ac.ed.inf.ilp.data.constant.OrderStatus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * defines an order which is available in the system
 */
public final class Order {
    private String orderNo = "";
    private LocalDate orderDate = LocalDate.MIN;
    private OrderStatus orderStatus = OrderStatus.UNDEFINED;
    private int statusReasonCode = InvalidOrderReasonCodes.UNDEFINED;
    private String customer = "";
    private String creditCardNumber = "";
    private String creditCardExpiry = "";
    private String cvv = "";
    private int priceTotalInPence = 0;
    private Pizza[] pizzasInOrder = new Pizza[0];

    /**
     *
     */
    public Order(String orderNo, LocalDate orderDate, OrderStatus orderStatus, int statusReasonCode, String customer, String creditCardNumber, String creditCardExpiry, String cvv, int priceTotalInPence, Pizza[] pizzasInOrder) {
        this(orderNo, orderDate, customer, creditCardNumber, creditCardExpiry, cvv, priceTotalInPence, pizzasInOrder);

        this.setOrderStatus(orderStatus);
        this.setStatusReasonCode(statusReasonCode);
    }

    /**
     *
     */
    public Order(String orderNo, LocalDate orderDate, String customer, String creditCardNumber, String creditCardExpiry, String cvv, int priceTotalInPence, Pizza[] pizzasInOrder) {
        this.setOrderNo(orderNo);
        this.setOrderDate(orderDate);
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
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
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
