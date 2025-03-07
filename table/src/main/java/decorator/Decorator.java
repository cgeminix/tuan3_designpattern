package decorator;

public interface Decorator {
    void handleRequest(); // Phương thức xử lý trạng thái của bàn
    String getColor(); // Trả về màu của trạng thái hiện tại
}