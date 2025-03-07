package strategy;

public class BasicSalaryStrategy implements SalaryStratery{
	 @Override
	    public double getAllowance() {
	        return 0;
	    }

	    @Override
	    public String getPosition() {
	        return "Nhân viên bình thường";
	    }
}
