package state;

public class CashState implements PaymentState{
	@Override
	public void pay() {
		System.out.println("Thanh toán bằng tiền mặt");
	}
}
