package Classes;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private int yearOfBirth;
	private String className;

	public Student(String firstName, String lastName, int age, int yearOfBirth, String classNam) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.yearOfBirth = yearOfBirth;
		this.className = classNam;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + ", Born in " + this.yearOfBirth + ", Age " + this.age + ", Goes to class " + this.className;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getClassNam() {
		return className;
	}

	public void setClassNam(String classNam) {
		this.className = classNam;
	}
}
