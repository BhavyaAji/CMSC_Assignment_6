/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: (Give a brief description for each Class)
 * This project focuses on running a program that allows a customer to purchase tickets for a circus. This class creates clerk object
 * Due: 12/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bhavya Aji
*/
public class Clerk extends Person {
	private String job;

	public Clerk(String name, int age, int yearsWorked, String job) {
		super(name, age, yearsWorked);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return String.format("Name: " + super.getName() + "\nAge: " + super.getAge() + "\nYears Worked: "
				+ super.getYearsWorked() + "\n Job: " + job);
	}

}
