package strategy;

public class ManagerSalaryStrategy implements SalaryStratery{
	@Override
    public double getAllowance() {
        return 2000000;
	}
	
    @Override
    public String getPosition() {
        return "Trưởng phòng";
    }
}
