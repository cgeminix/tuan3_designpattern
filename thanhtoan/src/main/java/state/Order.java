package state;

public class Order {
	private PaymentState paymentState;

    public Order(PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void processPayment() {
        paymentState.pay();
    }
}
