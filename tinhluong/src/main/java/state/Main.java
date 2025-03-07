package state;

public class Main {
	public static void main(String[] args) {
		// Nhân viên bình thường
        Employee emp1 = new Employee("Nguyễn Văn A", 10000000, new BasicSalaryState());
        emp1.printSalary();

        // Trưởng phòng
        Employee emp2 = new Employee("Trần Thị B", 12000000, new ManagerSalaryState());
        emp2.printSalary();

        // Hiệu trưởng
        Employee emp3 = new Employee("Phạm Văn C", 15000000, new PrincipalSalaryState());
        emp3.printSalary();

        // Đổi trạng thái lương (Nhân viên A được thăng chức)
        emp1.setSalaryState(new ManagerSalaryState());
        System.out.println("Sau khi thăng chức:");
        emp1.printSalary();
    }
}
