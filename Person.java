/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: (Give a brief description for each Class)
 * This project simulates a system which allows purchases for tickets. this class creates person objects
 * Due: 12/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bhavya Aji
*/

public abstract class Person {
	private String name;
	private int age;
	private int yearsWorked;

	public Person(String name, int age, int yearsWorked) {
		this.name = name;
		this.age = age;
		this.yearsWorked = yearsWorked;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getYearsWorked() {
		return yearsWorked;
	}

}