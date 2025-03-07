package decorator;

public class ManagerSalaryDeco implements SalaryDecorator{
	private SalaryDecorator salaryDecorator;

    public ManagerSalaryDeco(SalaryDecorator salaryDecorator) {
        this.salaryDecorator = salaryDecorator;
    }

    @Override
    public double getAllowance() {
        return salaryDecorator.getAllowance() + 2_000_000; // Thêm phụ cấp trưởng phòng
    }

    @Override
    public String getPosition() {
        return salaryDecorator.getPosition() + " - Trưởng phòng"; // Thêm chức vụ trưởng phòng
    }
}
