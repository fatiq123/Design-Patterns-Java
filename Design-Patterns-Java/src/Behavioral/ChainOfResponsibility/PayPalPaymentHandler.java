package Behavioral.ChainOfResponsibility;

public class PayPalPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1500) {
            System.out.println("paid using pay pal account: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }

}
