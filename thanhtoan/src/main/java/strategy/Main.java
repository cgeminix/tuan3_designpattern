package strategy;

public class Main {
	public static void main(String[] args) {
		PaymentStrategy momoPayment = new MomoPayment();
        PaymentStrategy vnPayPayment = new VNPayPayment();
        
        Order order1 = new Order(1, momoPayment);
        order1.processPayment();
        
        Order order2 = new Order(2, vnPayPayment);
        order2.processPayment();
	}
}
