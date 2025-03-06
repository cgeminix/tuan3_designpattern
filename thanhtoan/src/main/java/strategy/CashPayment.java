package strategy;

public class CashPayment implements PaymentStrategy{
	@Override
	public void pay() {
		System.out.println("Thanh toán bằng tiền mặt");
	}
}
