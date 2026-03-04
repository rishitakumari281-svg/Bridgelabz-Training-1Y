public class MainPayment {

    public static void main(String[] args) {

        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(1000);
        card.pay(2500);
        wallet.pay(500);
    }
}