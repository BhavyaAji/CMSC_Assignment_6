/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: (Give a brief description for each Class)
 * This project focuses on running a program that allows a customer to purchase tickets for a circus. 
 * This class creates attributes used by the main class, and implements other classes
 * Due: 12/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bhavya Aji
*/

import java.util.ArrayList;
import java.util.List;

public class Circus {
	private List<Animal> animals;
	private List<Person> persons;
	private List<Building> buildings;
	private List<Ticket> tickets;

	public Circus() {
		animals = new ArrayList<>();
		persons = new ArrayList<>();
		buildings = new ArrayList<>();
		tickets = new ArrayList<>();
	}

	// Add building
	public void addBuilding(Building b) {
		buildings.add(b);
	}

	// getBuildings returns buildings arrayList
	public List<Building> getBuildings() {
		return buildings;
	}

	// Display building
	public void displayAllBuildings() {
		for (Building temp : buildings) {
			System.out.println(temp + "\n");
		}
	}

	// Add person
	public void addPerson(Person p) {
		persons.add(p);
	}

	// getPersons returns persons arrayList
	public List<Person> getPersons() {
		return persons;
	}

	// Display person
	public void displayAllPersons() {
		for (Person temp : persons) {
			System.out.println(temp + "\n");
		}
	}

	// Add animal
	public void addAnimal(Animal a) {
		animals.add(a);
	}

	// get animals returns animals arrayList
	public List<Animal> getAnimals() {
		return animals;
	}

	// Display animal using toString() method
	public void displayAllAnimals() {
		for (Animal temp : animals) {
			System.out.println(temp + "\n");
		}
	}

	// Selection sort to sort animals by age
	public void sortAnimalsByAge() {
		for (int i = 0; i < animals.size() - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < animals.size(); j++) {
				if (animals.get(j).getAge() < animals.get(minIndex).getAge()) {
					minIndex = j;
				}
			}

			Animal temp = animals.get(i);
			animals.set(i, animals.get(minIndex));
			animals.set(minIndex, temp);
		}
	}

	// Selection sort to sort animals by name
	public void sortAnimalsByName() {
		for (int i = 0; i < animals.size() - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < animals.size(); j++) {
				if (animals.get(j).getName().compareToIgnoreCase(animals.get(minIndex).getName()) < 0) {
					minIndex = j;
				}
			}

			Animal temp = animals.get(i);
			animals.set(i, animals.get(minIndex));
			animals.set(minIndex, temp);
		}
	}

	// Search for an animal by name
	public void searchAnimalByName(String name) {
		boolean result = false;
		int index = -1;
		for (int i = 0; i < animals.size(); i++) {
			if ((animals.get(i).getName().equalsIgnoreCase(name))) {
				result = true;
				index = i;
			}
		}
		if (result == true) {
			System.out.println("The animal has been found!\n\n" + animals.get(index) + "\n");
		} else {
			System.out.println("The animal is not found.");
		}

	}

	// Add ticket
	public void addTicket(Ticket t) {
		tickets.add(t);
	}

	// Generate ticket
	public Ticket generateTicket(String dayOfWeek, double basePrice, int age) {
		Ticket ticket = new Ticket(dayOfWeek, basePrice, age); // Pass dayOfWeek, basePrice, age to Ticket constructor
		addTicket(ticket);
		return ticket;
	}
}
