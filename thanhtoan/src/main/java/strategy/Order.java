package strategy;

public class Order {
	private int id;
	private PaymentStrategy paymentStrategy;
	
	public Order(int id, PaymentStrategy paymentStrategy) {
		super();
		this.id = id;
		this.paymentStrategy = paymentStrategy;
	}
	
	// Thay đổi phương thức thanh toán
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
	//Phương thức thanh toán
	public void processPayment() {
		paymentStrategy.pay();
	}
	
}
