package state;

public class BasicSalaryState implements SalaryState{
	@Override
	public double getAllowance() {
		return 0;
	}
	 
	@Override
	public String getPosition() {
		return "Nhân viên bình thường";
	}
}
