package strategy;

public class Main {
	public static void main(String[] args) {
        Table table = new Table();

        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();  // Chuyển sang trạng thái "Order"
        System.out.println("Màu của bàn: " + table.getColor());

        table.setState("Done");  // Chuyển sang trạng thái "Done"
        table.handleRequest();  
        System.out.println("Màu của bàn: " + table.getColor());

        table.setState("Free");  // Chuyển sang trạng thái "Free"
        table.handleRequest();
        System.out.println("Màu của bàn: " + table.getColor());

        table.setState("Fixing");  // Thay đổi trạng thái thành "Fixing"
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();
    }
}
