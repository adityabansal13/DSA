package a_coursendComparatorvsComparable;

// comparator
public class Car{

	int price;
	int speed;
	String color;

	public Car() {

	}

	public Car(int price, int speed, String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return "P: " + this.price + " S: " + this.speed + " C: " + this.color;
	}

}
