package decorator;

public class Free implements Decorator {
    @Override
    public void handleRequest() {
        System.out.println("Bàn đang trống (Free). Có thể đặt món.");
        System.out.println("-------");
    }

    @Override
    public String getColor() {
        return "Green"; // Màu của trạng thái Free
    }
}

