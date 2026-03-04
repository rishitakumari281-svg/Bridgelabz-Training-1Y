public class Razorpay implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Razorpay");
    }
}