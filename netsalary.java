
public class netsalary {
	public static void main(String[] args) {
		double salary, tax, allowance, netsalary;
		salary=15000;
		tax=.10*salary;
		allowance=.15*salary;
		netsalary=(salary-tax)+allowance;
		System.out.println("netsalary is"+ netsalary);
		}

}
