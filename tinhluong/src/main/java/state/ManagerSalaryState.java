package state;

public class ManagerSalaryState implements SalaryState{
	@Override
    public double getAllowance() {
        return 2000000;
    }

    @Override
    public String getPosition() {
        return "Trưởng phòng";
    }
}
