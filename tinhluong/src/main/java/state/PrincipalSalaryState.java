package state;

public class PrincipalSalaryState implements SalaryState{
	@Override
    public double getAllowance() {
        return 5000000;
    }

    @Override
    public String getPosition() {
        return "Hiệu trưởng";
    }
}
