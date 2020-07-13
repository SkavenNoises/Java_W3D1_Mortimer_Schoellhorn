package Classes;

public class Employee {
	private String name;
	private String surname;
	private int yearOfBirth;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getSalary() {
		return "€" + salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
