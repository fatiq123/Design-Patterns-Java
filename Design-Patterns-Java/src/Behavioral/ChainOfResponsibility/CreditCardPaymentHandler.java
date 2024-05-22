package Behavioral.ChainOfResponsibility;

public class CreditCardPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("paid using credit card account: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }

}
