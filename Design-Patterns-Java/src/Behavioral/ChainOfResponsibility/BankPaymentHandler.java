package Behavioral.ChainOfResponsibility;

public class BankPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("paid using bank account: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }

}
