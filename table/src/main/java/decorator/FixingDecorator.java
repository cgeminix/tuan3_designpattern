package decorator;

public class FixingDecorator implements Decorator {
    private Decorator table;

    public FixingDecorator(Decorator table) {
        this.table = table;
    }

    @Override
    public void handleRequest() {
        System.out.println("Bàn đang sửa chữa (Fixing).");
        System.out.println("Bàn đang được sửa chữa.");
        System.out.println("-------");
    }

    @Override
    public String getColor() {
        return "Red"; // Màu của trạng thái Fixing
    }
}
