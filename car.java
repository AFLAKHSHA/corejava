public class Car {
	String carName;
	double mileage, price;
	boolean luxuryType;

	public void setCarDetails(String carName, double mileage, double price, boolean luxuryType) {
		this.carName = carName;
		this.mileage = mileage;
		this.price = price;
		this.luxuryType = luxuryType;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", mileage=" + mileage + ", price=" + price + ", luxuryType=" + luxuryType
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public void printCarDetails {
		this.toString();
	}

}