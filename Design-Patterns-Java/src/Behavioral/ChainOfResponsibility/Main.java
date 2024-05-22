package Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler paypal = new PayPalPaymentHandler();

        bank.setNext(creditCard);
        creditCard.setNext(paypal);

        bank.handlePayment(200);
        bank.handlePayment(600);
        bank.handlePayment(1500);
    }
}
