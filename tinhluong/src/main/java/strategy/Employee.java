package strategy;

import java.text.DecimalFormat;

public class Employee {
	private String name;
    private double baseSalary;
    private SalaryStratery salaryStrategy;

    private static final DecimalFormat df = new DecimalFormat("#,###.##");

    public Employee(String name, double baseSalary, SalaryStratery salaryStrategy) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.salaryStrategy = salaryStrategy;
    }

    public void setSalaryStrategy(SalaryStratery salaryStrategy) {
        this.salaryStrategy = salaryStrategy;
    }

    public void printSalary() {
        double allowance = salaryStrategy.getAllowance();
        double totalSalary = baseSalary + allowance;

        System.out.println(name + " - " + salaryStrategy.getPosition() + " :");
        System.out.println("Lương = " + df.format(baseSalary) + " + " + df.format(allowance) 
                           + " = " + df.format(totalSalary));
        System.out.println("-----------------------------------");
    }
}
