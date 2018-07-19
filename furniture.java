class cot {
	double price;
}

class diningtable {
	double price;
}

class chair {
	double price;
}

public class furniture {

	public static double calaculatedDiscount(diningtable dt) {
		return dt.price * .2;
	}

	public static double calaculatedDiscount(cot c) {
		return c.price * .1;
	}

	public static double calaculatedDiscount(chair ch) {
		return ch.price * .15;
	}

	public static void main(String[] args) {
		chair ch = new chair();
		diningtable dt = new diningtable();
		cot c = new cot();

		c.price = 50;
		ch.price = 60;
		dt.price = 40;
		System.out.println(calaculatedDiscount(c));
		System.out.println(calaculatedDiscount(dt));
		System.out.println(calaculatedDiscount(ch));

	}
}