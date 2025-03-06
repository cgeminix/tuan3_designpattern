package decorator;

public class CashPayment implements Payment{
	@Override
	public void pay() {
		System.out.println("Thanh toán bằng tiền mặt");
	}
}
