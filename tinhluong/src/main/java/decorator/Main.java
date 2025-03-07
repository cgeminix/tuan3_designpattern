package decorator;

public class Main {
	public static void main(String[] args) {
		 Employee emp1 = new Employee("Nguyễn Văn A", new BasicSalaryDeco(10_000_000));

	        // Trưởng phòng
	        Employee emp2 = new Employee("Trần Thị B", new ManagerSalaryDeco(new BasicSalaryDeco(10_000_000)));

	        // Hiệu trưởng
	        Employee emp3 = new Employee("Phạm Văn C", new PrincipalSalaryDeco(new BasicSalaryDeco(10_000_000)));

	        // Trưởng phòng & Hiệu trưởng
	        Employee emp4 = new Employee("Lê Thị D", new PrincipalSalaryDeco(new ManagerSalaryDeco(new BasicSalaryDeco(10_000_000))));

	        // In thông tin lương ban đầu
	        emp1.printSalary();
	        emp2.printSalary();
	        emp3.printSalary();
	        emp4.printSalary();

	        // Nhân viên thăng chức thành Trưởng phòng
	        emp1.promote(new ManagerSalaryDeco(new BasicSalaryDeco(10_000_000)));

	        System.out.println("Sau khi thăng chức:");
	        emp1.printSalary();
	    }
}
