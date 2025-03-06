package state;

public class Main {
	public static void main(String[] args) {
		PaymentState momo = new MomoState();
        PaymentState vnPay = new VNPayState();
        PaymentState cash = new CashState();
        PaymentState bank = new BankTransferState();

        Order order1 = new Order(momo);
        order1.processPayment();  // Thanh toán qua Momo.

        order1.setPaymentState(vnPay);
        order1.processPayment();  // Thanh toán qua VNPay.

        order1.setPaymentState(cash);
        order1.processPayment();  // Thanh toán bằng tiền mặt.

        order1.setPaymentState(bank);
        order1.processPayment();  // Thanh toán bằng chuyển khoản
	}
}
