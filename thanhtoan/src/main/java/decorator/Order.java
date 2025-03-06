package decorator;

public class Order {
	private Payment payment;

    public Order(Payment payment) {
        this.payment = payment;
    }

    public void processPayment() {
        payment.pay();
    }
}
