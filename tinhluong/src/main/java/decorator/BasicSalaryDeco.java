package decorator;

public class BasicSalaryDeco implements SalaryDecorator{
	private double baseSalary;

    public BasicSalaryDeco(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getAllowance() {
        return 0;
    }

    @Override
    public String getPosition() {
        return "Nhân viên bình thường";
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
