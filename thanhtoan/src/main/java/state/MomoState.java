package state;

public class MomoState implements PaymentState{
	@Override
	public void pay() {
		System.out.println("Thanh toán quá Momo");
	}
}
