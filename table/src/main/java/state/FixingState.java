package state;

public class FixingState implements State{
	@Override
    public void handleRequest(Table table) {
        System.out.println("Bàn đang sửa chữa (Fixing).");
        System.out.println("--------------------");
        table.setState(new DoneState());  // Sau khi sửa chữa xong, bàn chuyển sang trạng thái "Done"
    }
}
