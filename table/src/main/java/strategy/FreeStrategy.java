package strategy;

public class FreeStrategy implements Strategy{
	@Override
    public void handleRequest() {
        System.out.println("Bàn đang trống (Free). Có thể đặt món.");
        System.out.println("----------------------------");
    }

    @Override
    public String getColor() {
        return "Green";  // Trạng thái "Free" có màu xanh
    }
}
