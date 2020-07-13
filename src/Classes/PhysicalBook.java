package Classes;

public class PhysicalBook extends Book{
	private double weight; // in kg

	public PhysicalBook(String name, String description, double price, double weight) {
		super(name, description, price);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name: " + getName() +
				", description: " + getDescription() +
				", price: €" + getPrice() +
				", weight: " + getWeight();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
