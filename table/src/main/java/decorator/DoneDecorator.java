package decorator;

public class DoneDecorator implements Decorator {
    private Decorator table;

    public DoneDecorator(Decorator table) {
        this.table = table;
    }

    @Override
    public void handleRequest() {
        System.out.println("Bàn đã hoàn thành (Done). Cần dọn dẹp.");
        System.out.println("Bàn đã được dọn dẹp.");
        System.out.println("-------");
    }

    @Override
    public String getColor() {
        return "Yellow"; // Màu của trạng thái Done
    }
}
