package decorator;

public class VnPayPayment implements Payment{
	@Override
	public void pay() {
		System.out.println("Thanh toán qua VNPay");
	}
}
