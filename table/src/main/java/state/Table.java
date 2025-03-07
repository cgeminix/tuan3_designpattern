package state;

public class Table {
	private State currentState;

    public Table() {
        currentState = new FreeState();  // Ban đầu, bàn là trạng thái "Free"
    }

    public void handleRequest() {
        currentState.handleRequest(this);  // Gọi phương thức xử lý của trạng thái hiện tại
    }

    public void setState(State state) {
        this.currentState = state;  // Thay đổi trạng thái của bàn
    }

    public String getColor() {
        if (currentState instanceof FreeState) {
            return "Green";  // Bàn trống màu xanh lá
        } else if (currentState instanceof OrderState) {
            return "Orange";  // Bàn đặt món màu cam
        } else if (currentState instanceof DoneState) {
            return "Yellow";  // Bàn đã hoàn thành màu vàng
        } else if (currentState instanceof FixingState) {
            return "Red";  // Bàn sửa chữa màu đỏ
        }
        return "Unknown";
    }
}
