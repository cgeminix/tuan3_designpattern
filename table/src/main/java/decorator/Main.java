package decorator;

public class Main {
	public static void main(String[] args) {
        // Trạng thái bàn ban đầu là Free
        Decorator table = new Free();
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();

        // Chuyển sang trạng thái "Order"
        table = new OrderDecorator(table);
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();

        // Chuyển sang trạng thái "Done"
        table = new DoneDecorator(table);
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();

        // Chuyển sang trạng thái "Fixing"
        table = new FixingDecorator(table);
        System.out.println("Màu của bàn: " + table.getColor());
        table.handleRequest();
    }
}
