package decorator;

import java.text.DecimalFormat;

public class Employee {
	private String name;
    private SalaryDecorator salaryDecorator;

    public Employee(String name, SalaryDecorator salaryDecorator) {
        this.name = name;
        this.salaryDecorator = salaryDecorator;
    }

    // Thăng chức
    public void promote(SalaryDecorator newSalaryDecorator) {
        this.salaryDecorator = newSalaryDecorator;
    }
    
    private static final DecimalFormat df = new DecimalFormat("#,###.##");
    
    // In thông tin lương
    public void printSalary() {
        double totalSalary = 10_000_000 + salaryDecorator.getAllowance(); // Lương cơ bản + phụ cấp
        System.out.println(name + " - " + salaryDecorator.getPosition() + " :");
        System.out.println("Lương = 10,000,000 + " + salaryDecorator.getAllowance() + " = " + df.format(totalSalary));
        System.out.println("-----------------------------------");
    }
}
