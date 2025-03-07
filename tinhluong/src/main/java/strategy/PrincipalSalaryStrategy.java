package strategy;

public class PrincipalSalaryStrategy implements SalaryStratery{
	@Override
    public double getAllowance() {
        return 5000000;
    }

    @Override
    public String getPosition() {
        return "Hiệu trưởng";
    }
}
