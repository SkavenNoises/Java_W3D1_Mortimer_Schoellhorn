package Classes;

public class Animal extends Product {
	private double weight;
	private int age;
	private String breed;

	public Animal(String name, String description, double price, double weight, int age, String breed) {
		super(name, description, price);
		this.weight = weight;
		this.age = age;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Name: " + getName() +
				", Description: " + getDescription() +
				", Price: €" + getPrice() +
				", Weight: " + getWeight() +
				", age: " + getAge() +
				", breed: " + getBreed();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
