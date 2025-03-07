package state;

public class Main {
	public static void main(String[] args) {
        Table table = new Table();

        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();  // Chuyển sang trạng thái "Order"
        
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();  // Chuyển sang trạng thái "Done"
        
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();  // Chuyển sang trạng thái "Free"
        
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();
        
        table.setState(new FixingState());  // Thay đổi trạng thái bàn thành "Fixing"
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();  // Chuyển sang trạng thái "Done"
	}
}
