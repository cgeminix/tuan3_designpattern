package state;

import java.text.DecimalFormat;

public class Employee {
	private String name;
    private double baseSalary;
    private SalaryState salaryState;
    
    private static final DecimalFormat df = new DecimalFormat("#,###.##");
    
    public Employee(String name, double baseSalary, SalaryState salaryState) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.salaryState = salaryState;
    }

    public void setSalaryState(SalaryState salaryState) {
        this.salaryState = salaryState;
    }

    public void printSalary() {
        double allowance = salaryState.getAllowance();
        double totalSalary = baseSalary + allowance;

        System.out.println(name + " - " + salaryState.getPosition() + " :");
        System.out.println("Lương = " + df.format(baseSalary) + " + " + df.format(allowance) 
                           + " = " + df.format(totalSalary));
        System.out.println("-----------------------------------");
    }
}
