package decorator;

public class OrderDecorator implements Decorator {
    private Decorator table;

    public OrderDecorator(Decorator table) {
        this.table = table;
    }

    @Override
    public void handleRequest() {
        System.out.println("Bàn đã đặt món (Order).");
        System.out.println("Đã thêm món vào đơn.");
        System.out.println("-------");
    }

    @Override
    public String getColor() {
        return "Orange"; // Màu của trạng thái Order
    }
}