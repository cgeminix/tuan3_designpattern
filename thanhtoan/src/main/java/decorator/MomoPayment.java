package decorator;

public class MomoPayment implements Payment{
	@Override
	public void pay() {
		System.out.println("Thanh toán qua Momo");
	}
}
