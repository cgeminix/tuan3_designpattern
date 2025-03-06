package strategy;

public class BankTransferPayment implements PaymentStrategy{
	@Override
	public void pay() {
		System.out.println("Thanh toán qua chuyển khoản");
	}
}
