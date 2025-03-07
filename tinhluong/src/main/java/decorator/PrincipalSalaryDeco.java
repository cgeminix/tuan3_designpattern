package decorator;

public class PrincipalSalaryDeco implements SalaryDecorator{
	private SalaryDecorator salaryDecorator;

    public PrincipalSalaryDeco(SalaryDecorator salaryDecorator) {
        this.salaryDecorator = salaryDecorator;
    }

    @Override
    public double getAllowance() {
        return salaryDecorator.getAllowance() + 5_000_000; // Thêm phụ cấp hiệu trưởng
    }

    @Override
    public String getPosition() {
        return salaryDecorator.getPosition() + " - Hiệu trưởng"; // Thêm chức vụ hiệu trưởng
    }
}
