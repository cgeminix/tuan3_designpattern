package state;

public class OrderState implements State{
	@Override
    public void handleRequest(Table table) {
        System.out.println("Bàn đã đặt món (Order).");
        System.out.println("--------------------");
        table.setState(new DoneState());  // Chuyển sang trạng thái "Done" sau khi món đã được phục vụ
    }
}
