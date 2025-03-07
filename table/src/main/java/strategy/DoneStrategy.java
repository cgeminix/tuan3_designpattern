package strategy;

public class DoneStrategy implements Strategy{
	@Override
    public void handleRequest() {
        System.out.println("Bàn đã hoàn thành (Done). Cần dọn dẹp.");
        System.out.println("----------------------------");
    }

    @Override
    public String getColor() {
        return "Yellow";  // Trạng thái "Done" có màu vàng
    }
}
