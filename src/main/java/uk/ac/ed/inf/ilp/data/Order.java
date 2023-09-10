package uk.ac.ed.inf.ilp.data;

import uk.ac.ed.inf.ilp.constant.OrderValidationCode;
import uk.ac.ed.inf.ilp.constant.OrderStatus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * defines an order in the PizzaDronz service
 */
public final class Order {

    /**
     * the order #
     */
    private String orderNo = "";

    /**
     * the order date
     */
    private LocalDate orderDate = LocalDate.MIN;

    /**
     * the order status
     */
    private OrderStatus orderStatus = OrderStatus.UNDEFINED;

    /**
     * if an order is invalid the reason code for it
     */
    private OrderValidationCode orderValidationCode = OrderValidationCode.UNDEFINED;

    /**
     * the order total in pence
     */
    private int priceTotalInPence = 0;

    /**
     * the pizzas this order consists of
     */
    private Pizza[] pizzasInOrder = new Pizza[0];

    /**
     * the credit card to use for this order
     */
    private CreditCardInformation creditCardInformation = null;

    /**
     * full constructor for an order
     *
     * @param orderNo               the number
     * @param orderDate             is when the order is due (to be delivered)
     * @param orderStatus           is the status
     * @param orderValidationCode   is a reason code for the status (extended explanation)
     * @param priceTotalInPence     is the total price of the order
     * @param pizzasInOrder         is the list of pizzas in the order
     * @param creditCardInformation is the credit card to use
     */
    public Order(String orderNo, LocalDate orderDate, OrderStatus orderStatus, OrderValidationCode orderValidationCode, int priceTotalInPence, Pizza[] pizzasInOrder, CreditCardInformation creditCardInformation) {
        this(orderNo, orderDate, priceTotalInPence, pizzasInOrder, creditCardInformation);

        this.setOrderStatus(orderStatus);
        this.setOrderValidationCode(orderValidationCode);
    }

    /**
     * full constructor for an order
     *
     * @param orderNo               the number
     * @param orderDeliveryDate     is when the order is due (to be delivered)
     * @param priceTotalInPence     is the total price of the order
     * @param pizzasInOrder         is the list of pizzas in the order
     * @param creditCardInformation is the credit card to use
     */
    public Order(String orderNo, LocalDate orderDeliveryDate, int priceTotalInPence, Pizza[] pizzasInOrder, CreditCardInformation creditCardInformation) {
        this.setOrderNo(orderNo);
        this.setOrderDate(orderDeliveryDate);
        this.setPriceTotalInPence(priceTotalInPence);
        this.setPizzasInOrder(pizzasInOrder);
    }

    /**
     * bare bone default constructor
     */
    public Order() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderNo(), getOrderDate(), getOrderStatus(), getOrderValidationCode(), getPriceTotalInPence(), Arrays.hashCode(getPizzasInOrder()));
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

    public void setOrderDate(LocalDate orderDeliveryDate) {
        this.orderDate = orderDeliveryDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderValidationCode getOrderValidationCode() {
        return orderValidationCode;
    }

    public void setOrderValidationCode(OrderValidationCode orderValidationCode) {
        this.orderValidationCode = orderValidationCode;
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

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }
}
