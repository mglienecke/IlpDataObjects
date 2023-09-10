package uk.ac.ed.inf.ilp.data;

public class CreditCardInformation {
    /**
     * the credit card number - we consider 16 digit MASTERCARD and VISA
     */
    private String creditCardNumber = "";

    /**
     * the expiry date as MM/YY like in 09/24
     */
    private String creditCardExpiry = "";

    /**
     * the CVV of the credit card - 3 digits
     */
    private String cvv = "";

    /**
     * full constructor for an order
     * @param creditCardNumber is the CC to be used (16 digit versions only)
     * @param creditCardExpiry is when the card expires
     * @param cvv is the CVV of the card
     */
    public CreditCardInformation(String creditCardNumber, String creditCardExpiry, String cvv) {
        this.setCreditCardNumber(creditCardNumber);
        this.setCreditCardExpiry(creditCardExpiry);
        this.setCvv(cvv);
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
}
