package decorator;

public class ServiceFeeDecorator extends PaymentDecorator{
	public ServiceFeeDecorator(Payment payment) {
		super(payment);
	}
	@Override
    public void pay() {
        payment.pay();
        addServiceFee();
    }

    private void addServiceFee() {
        System.out.println("Thêm phí dịch vụ 5%.");
    }
}
