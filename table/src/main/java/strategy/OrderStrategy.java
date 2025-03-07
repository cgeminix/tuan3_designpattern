package strategy;

public class OrderStrategy implements Strategy{
	@Override
    public void handleRequest() {
        System.out.println("Bàn đã đặt món (Order).");
        System.out.println("----------------------------");
    }

    @Override
    public String getColor() {
        return "Orange";  // Trạng thái "Order" có màu cam
    }
}
