package strategy;

public class Main {
	public static void main(String[] args) {
 
        Employee emp1 = new Employee("Nguyễn Văn A", 10000000, new BasicSalaryStrategy());
        emp1.printSalary();

        Employee emp2 = new Employee("Trần Thị B", 12000000, new ManagerSalaryStrategy());
        emp2.printSalary();

        Employee emp3 = new Employee("Phạm Văn C", 15000000, new PrincipalSalaryStrategy());
        emp3.printSalary();

        emp1.setSalaryStrategy(new ManagerSalaryStrategy());
        System.out.println("Sau khi thăng chức:");
        emp1.printSalary();
    }
}
