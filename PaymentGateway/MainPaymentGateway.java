public class MainPaymentGateway {

    public static void main(String[] args) {

        PaymentProcessor processor = new Razorpay();

        processor.pay(2000);
        processor.refund(500);
    }
}