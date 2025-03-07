package strategy;

import java.util.HashMap;
import java.util.Map;

public class Table {
	private Strategy currentState;

    // Map để ánh xạ trạng thái với màu sắc
    private static final Map<String, Strategy> stateMap = new HashMap<>();

    static {
        // Khởi tạo các chiến lược tương ứng
        stateMap.put("Free", new FreeStrategy());
        stateMap.put("Order", new OrderStrategy());
        stateMap.put("Done", new DoneStrategy());
        stateMap.put("Fixing", new FixingStrategy());
    }

    public Table() {
        this.currentState = stateMap.get("Free");  // Mặc định ban đầu là trạng thái Free
    }

    public void handleRequest() {
        currentState.handleRequest();  // Gọi hành động của chiến lược hiện tại
    }

    public void setState(String state) {
        this.currentState = stateMap.get(state);  // Chuyển trạng thái dựa trên tên
    }

    public String getColor() {
        return currentState.getColor();  // Lấy màu sắc của trạng thái hiện tại
    }
}
