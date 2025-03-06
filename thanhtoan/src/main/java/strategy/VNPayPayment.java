package strategy;

public class VNPayPayment implements PaymentStrategy{
	@Override
	public void pay() {
		System.out.println("Thanh toán qua VNPay");
	}
}
