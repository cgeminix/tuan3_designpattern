package strategy;

public class FixingStrategy implements Strategy{
	 @Override
	 public void handleRequest() {
		 System.out.println("Bàn đang sửa chữa (Fixing).");
		 System.out.println("----------------------------");
	 }

	 @Override
	 public String getColor() {
		 return "Red";  // Trạng thái "Fixing" có màu đỏ
	 }
}
