import Classes.*;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		#######################################
					Exercise 1
		#######################################
		*/

		Employee testEmployee = new Employee();
		testEmployee.setName("tod");
		testEmployee.setSalary(2000);
		testEmployee.setSurname("howards");
		testEmployee.setYearOfBirth(1996);

		System.out.println("Employee Name: " + testEmployee.getName() + " " + testEmployee.getSurname());
		System.out.println("Year of Birth: " + testEmployee.getYearOfBirth());
		System.out.println("Salary: " + testEmployee.getSalary() + "\n");


		/*
		#######################################
					Exercise 2
		#######################################

		You can find the results in classes/dog
		*/

		/*
		#######################################
					Exercise 3
		#######################################
		*/

		ArrayList<Student> studentArrayList = new ArrayList<>();
		studentArrayList.add(new Student("John", "Smith", 23, 1995, "b5"));
		studentArrayList.add(new Student("Jane", "Doe", 21, 1996, "c4"));
		studentArrayList.add(new Student("Ted", "Guy", 21, 1999, "a5"));
		studentArrayList.add(new Student("Hannah", "Jefferies", 23, 1995, "d3"));
		studentArrayList.add(new Student("Shannon", "McIre", 24, 1998, "e2"));

		for (Student s : studentArrayList) {
			System.out.println(s.toString());
		}

		System.out.println();

		/*
		#######################################
					Exercise 4
		#######################################

		Look in package1 & 2 for A,B,C classes

		Default:  standard behaviour with no prepended access modifier, behaves similarly to public
		Protected: Package-wide "public" behaviour
		*/

		/*
		#######################################
					Exercise 5
		#######################################
		*/
		String[] items = new String[] {"Shelf", "Table", "Lamp", "Sink", "Bookcase", "Toilet Seat"};
		Warehouse warehouse = new Warehouse(items);
		warehouse.displayInventory();

		System.out.println();

		/*
		#######################################
					Exercise 6
		#######################################
		*/
		PhysicalBook physicalBook = new PhysicalBook("Java101", "Learn java in just 30mins", 45.99, 5);
		ElectronicBook electronicBook = new ElectronicBook("Javascript101", "Fun based JS actitives", 23.99, "https://somewebsite.com");

		System.out.println(physicalBook.toString());
		System.out.println(electronicBook.toString());

	}
}
