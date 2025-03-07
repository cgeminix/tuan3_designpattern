package state;

public class DoneState implements State{
	 @Override
	 public void handleRequest(Table table) {
		 System.out.println("Bàn đã hoàn thành (Done) và cần dọn dẹp.");
		 System.out.println("--------------------");
	     table.setState(new FreeState());  // Chuyển sang trạng thái "Free" sau khi dọn dẹp xong
	 }
}
