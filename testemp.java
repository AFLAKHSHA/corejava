
public class testemp {
	public static void main(String[] args) {
		emp e1 = new emp(222, "aflu", 5002);
		double bonus = e1.calculatebonus();
		System.out.println(bonus);
		System.out.println(emp.getCompanyName() );
	}

}
