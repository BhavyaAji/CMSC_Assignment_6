
/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: (Give a brief description for each Class)
 * This project focuses on running a program that allows a customer to purchase tickets for a circus. this class creates dog object, 
 * extends animal
 * Due: 12/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bhavya Aji
*/
import java.util.Objects;

public class Dog implements Animal, Cloneable {
	// Instance variables
	private String name;
	private int age;
	protected String species;
	protected String color;

	// Constructor
	public Dog(String name, int age, String species, String color) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("The dog walked.");
	}

	@Override
	public void makeSound() {
		System.out.println("The dog barked.");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(name, other.name)
				&& Objects.equals(species, other.species);
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nSpecies: " + species + "\nColor: " + color;
	}

}
