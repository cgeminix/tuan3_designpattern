package state;

public class BankTransferState implements PaymentState{
	@Override
	public void pay() {
		System.out.println("Thanh toán bằng chuyển khoản.");
	}
}
