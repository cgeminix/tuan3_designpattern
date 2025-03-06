package state;

public class VNPayState implements PaymentState{
	@Override
	public void pay() {
		System.out.println("Thanh toán qua VNPay");
	}
}
