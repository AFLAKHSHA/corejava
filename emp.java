
public class emp {
	private int empId;
	private String empName;
	private double empSalry;

	emp(int empId, String empName, double empSalry) {

	}

	public double calculatebonus() {
		double bonus = 0.0; // local variable
		if (this.empSalry <= 5000) {
			bonus = this.empSalry * .2;
		} else
			bonus = this.empSalry * .1;
		return bonus;

	}public String getCoName() {
}
