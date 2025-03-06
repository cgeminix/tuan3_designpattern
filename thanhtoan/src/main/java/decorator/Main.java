package decorator;

public class Main {
	public static void main(String[] args) {
        // Tạo đối tượng thanh toán Momo
        Payment momoPayment = new MomoPayment();

        // Thêm phí dịch vụ vào Momo
        Payment momoWithServiceFee = new ServiceFeeDecorator(momoPayment);

        // Thêm giảm giá vào Momo + phí dịch vụ
        Payment momoWithServiceFeeAndDiscount = new DiscountDecorator(momoWithServiceFee);

        // Xử lý thanh toán Momo với phí dịch vụ và giảm giá
        Order order1 = new Order(momoWithServiceFeeAndDiscount);
        order1.processPayment();
        // Output:
        // Thanh toán qua Momo.
        // Thêm phí dịch vụ 5%.
        // Áp dụng giảm giá 10%.

        // Tương tự cho VNPay
        Payment vnPayPayment = new VnPayPayment();
        Payment vnPayWithServiceFee = new ServiceFeeDecorator(vnPayPayment);
        Order order2 = new Order(vnPayWithServiceFee);
        order2.processPayment();
        // Output:
        // Thanh toán qua VNPay.
        // Thêm phí dịch vụ 5%.
    }
}
