package strategy;

public class MomoPayment implements PaymentStrategy{
	@Override
	public void pay() {
		System.out.println("Thanh toán qua Momo.");
	}
}
