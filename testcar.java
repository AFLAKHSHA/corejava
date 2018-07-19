
public class testcar {
	public static void main(String[] args) {

		car c1 = new car();
		car c2 = new car();
		car c3 = new car();
		car c4 = new car();
		car c5 = new car();
		
		c1.setCarDetails("alto", 20, 100, false);
		c2.setCarDetails("zen", 17, 101, false);
		c3.setCarDetails("benz", 25, 1200, true);
		c4.setCarDetails("swift", 22, 120, false);
		c5.setCarDetails("nano", 23, 60, false);
		
		car cars[]= {c1,c2,c3,c4,c5};
	}
}
