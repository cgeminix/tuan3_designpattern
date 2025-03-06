package decorator;

public class DiscountDecorator extends PaymentDecorator{
	public DiscountDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay() {
        payment.pay();
        addDiscount();
    }

    private void addDiscount() {
        System.out.println("Áp dụng giảm giá 10%.");
    }
}
