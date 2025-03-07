package state;

public class FreeState implements State{
	@Override
    public void handleRequest(Table table) {
        System.out.println("Bàn đang trống (Free) - có thể đặt món.");
        System.out.println("--------------------");
        table.setState(new OrderState());  // Chuyển sang trạng thái "Order" khi có khách đặt món
    }
}
