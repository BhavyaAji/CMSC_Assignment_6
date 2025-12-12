/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: (Give a brief description for each Class)
 * This project focuses on running a program that allows a customer to purchase tickets for a circus. This class implements all the other classes.
 * Due: 12/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bhavya Aji
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircusDriverApp {
	public static void main(String[] args) {
		Circus circus = new Circus();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		System.out.println("Welcome to Bob's Circus Management System!");

		while (!exit) {
			try {
				// Display menu
				System.out.println("\nMenu:");
				System.out.println("1. Add Animal");
				System.out.println("2. Add Person");
				System.out.println("3. Add Building");
				System.out.println("4. Generate Ticket");
				System.out.println("5. Display All Animals");
				System.out.println("6. Display All Persons");
				System.out.println("7. Display All Buildings");
				System.out.println("8. Sort Animals by Age");
				System.out.println("9. Sort Animals by Name");
				System.out.println("10. Search Animal by Name");
				System.out.println("11. Exit\n");

				System.out.print("Choose an option: ");

				// Use validateInput method
				int choice = 0;
				boolean validInput = false;

				while (!validInput) {
					try {
						choice = validateInput(scanner);

						if (choice < 1 || choice > 11) {
							throw new CustomInputMismatchException();
						}

						validInput = true;
					} catch (CustomInputMismatchException e) {
						System.out.println(e.getMessage());
					}
				}

				switch (choice) {
				case 1:
					handleAddAnimal(circus, scanner);
					break;
				case 2:
					handleAddPerson(circus, scanner);
					break;
				case 3:
					handleAddBuilding(circus, scanner);
					break;
				case 4:
					handleGenerateTicket(scanner);
					break;
				case 5:
					System.out.println("Displaying all animals:");
					System.out.println("----------------------");
					circus.displayAllAnimals();
					break;
				case 6:
					System.out.println("Displaying all persons:");
					System.out.println("----------------------");
					circus.displayAllPersons();
					break;
				case 7:
					System.out.println("Displaying all buildings:");
					System.out.println("------------------------");
					circus.displayAllBuildings();
					break;
				case 8:
					System.out.println("Sorting animals by age...");
					circus.sortAnimalsByAge();
					System.out.println("Animals sorted by age.");
					break;
				case 9:
					System.out.println("Sorting animals by name...");
					circus.sortAnimalsByName();
					System.out.println("Animals sorted by name.");
					break;
				case 10:
					System.out.print("Enter the name of the animal to search: ");
					String searchName = scanner.nextLine();
					circus.searchAnimalByName(searchName);
					break;
				case 11:
					exit = true;
					System.out.println("Exiting Bob's Circus Management System. Goodbye!\n");
					break;
				default:
					System.out.println("Invalid option. Please choose again.");
				}

			} catch (Exception e) {
				System.out.println("An unexpected error occurred: " + e.getMessage());
				e.printStackTrace();
			}

		}

		scanner.close();
	}

	private static int validateInput(Scanner scanner) throws CustomInputMismatchException {
		try {
			int choice = scanner.nextInt();
			scanner.nextLine();
			return choice;
		} catch (InputMismatchException e) {
			scanner.nextLine();
			throw new CustomInputMismatchException();
		}
	}

	public static void handleAddAnimal(Circus circus, Scanner scanner) {
		Animal animal = null;
		String name, species, color;
		int choice = 0, age;
		do {
			System.out.println("Please select a valid animal you would like to add: ");
			System.out.println("1: Bird");
			System.out.println("2: Dog");
			System.out.println("3: Horse");
			System.out.println("4: Lion");
			choice = scanner.nextInt();
			scanner.nextLine(); // buffer
		} while (choice > 4 || choice < 1);

		System.out.println("Please enter a name: ");
		name = scanner.nextLine();
		System.out.println("Please enter an age: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the species: ");
		species = scanner.nextLine();
		System.out.println("Please enter the color: ");
		color = scanner.nextLine();

		switch (choice) {
		case 1:
			animal = new Bird(name, age, species, color);
			break;
		case 2:
			animal = new Dog(name, age, species, color);
			break;
		case 3:
			animal = new Horse(name, age, species, color);
			break;
		case 4:
			animal = new Lion(name, age, species, color);
			break;
		}
		circus.addAnimal(animal);
	}

	public static void handleAddPerson(Circus circus, Scanner scanner) {
		Person person;
		int choice = 0, age, yearsWorked;
		String name, job;

		do {
			System.out.println("Please select a valid person you would like to add: ");
			System.out.println("1: Acrobatic");
			System.out.println("2: Clerk");
			choice = scanner.nextInt();
			scanner.nextLine(); // buffer :-)
		} while (choice > 2 || choice < 1);

		System.out.println("Please enter the name: ");
		name = scanner.nextLine();
		System.out.println("Please enter the age: ");
		age = scanner.nextInt();
		System.out.println("Please enter the years worked: ");
		yearsWorked = scanner.nextInt();
		scanner.nextLine();// buffer
		System.out.println("Please enter the job: ");
		job = scanner.nextLine();

		switch (choice) {
		case 1:
			person = new Acrobatic(name, age, yearsWorked, job);
			break;
		case 2:
			person = new Clerk(name, age, yearsWorked, job);
			break;
		default:
			person = null;
			break;
		}
		circus.addPerson(person);
	}

	public static void handleAddBuilding(Circus circus, Scanner scanner) {
		Building building;
		double length, width;
		int choice = 0;
		String color;

		do {
			System.out.println("Please select a valid building you would like to add: ");
			System.out.println("1: Arena");
			System.out.println("2: Ticketing Office");
			choice = scanner.nextInt();
			scanner.nextLine(); // buffer
		} while (choice > 2 || choice < 1);

		System.out.println("Please enter the color: ");
		color = scanner.nextLine();
		System.out.println("Please enter the length: ");
		length = scanner.nextDouble();
		System.out.println("Please enter the width: ");
		width = scanner.nextDouble();

		switch (choice) {
		case 1:
			building = new Arena(color, length, width);
			break;
		case 2:
			building = new TicketingOffice(color, length, width);
			break;
		default:
			building = null;
			break;
		}
		circus.addBuilding(building);
	}

	private static void handleGenerateTicket(Scanner scanner) {
		double totalAmount = 0;
		double basePrice;
		StringBuilder ticketDetails = new StringBuilder();
		boolean addMoreTickets = true;

		System.out.print("\nEnter ticket base price: ");
		basePrice = scanner.nextDouble();
		scanner.nextLine();

		ticketDetails.append(String.format("Regular ticket price: $%.2f%n%n", basePrice));

		while (addMoreTickets) {
			// Select day of the week
			System.out.println("\nSelect day of the week:");
			for (int i = 0; i < DayOfWeek.values().length; i++) {
				DayOfWeek day = DayOfWeek.values()[i];
				if (day.getDiscount() > 0) {
					System.out.printf("%d. %s (%.0f%% discount)%n", i + 1, day, day.getDiscount() * 100);
				} else {
					System.out.printf("%d. %s%n", i + 1, day);
				}
			}
			System.out.print("\nEnter your choice: ");
			int dayChoice = scanner.nextInt();
			scanner.nextLine();

			if (dayChoice < 1 || dayChoice > DayOfWeek.values().length) {
				System.out.println("Invalid choice. Please select a valid day.");
				continue;
			}

			DayOfWeek selectedDay = DayOfWeek.values()[dayChoice - 1];
			double dayDiscount = selectedDay.getDiscount();

			// Select customer type
			System.out.println("\nEnter customer type:");
			System.out.println("1. Child (10% discount)");
			System.out.println("2. Student (10% discount)");
			System.out.println("3. Adult");
			System.out.println("4. Senior (5% discount)");
			System.out.print("\nEnter your choice: ");
			int customerType = scanner.nextInt();
			scanner.nextLine();
			int age;

			if (customerType == 1) {
				age = 10;
			} else if (customerType == 2) {
				age = 20;
			} else if (customerType == 4) {
				age = 70;
			} else {
				age = 35;
			}

			double customerDiscount = 0.0;
			String customerTypeName = "";
			switch (customerType) {
			case 1:
				customerDiscount = 0.10;
				customerTypeName = "child";
				break;
			case 2:
				customerDiscount = 0.10;
				customerTypeName = "student";
				break;
			case 3:
				customerTypeName = "adult";
				break;
			case 4:
				customerDiscount = 0.05;
				customerTypeName = "senior";
				break;
			default:
				System.out.println("Invalid customer type. Please try again.");
				continue;
			}

			// Select seat location
			System.out.println("\nSeat Location in the Arena:");
			System.out.println("1. Lower level");
			System.out.println("2. T-level (double ticket price)");
			System.out.println("3. Upper level (5% discount)");
			System.out.print("\nEnter your choice: ");
			int seatLocation = scanner.nextInt();
			scanner.nextLine();

			double seatMultiplier = (seatLocation == 2) ? 2.0 : 1.0;
			double seatDiscount = (seatLocation == 3) ? 0.05 : 0.0;

			System.out.print("Enter number of tickets: ");
			int numberOfTickets = scanner.nextInt();
			scanner.nextLine();

			Ticket ticket = new Ticket(selectedDay.toString(), basePrice, age);
			double finalPrice = ticket.calculatePrice();

			finalPrice *= seatMultiplier;
			finalPrice *= (1 - seatDiscount);

			double batchTotal = finalPrice * numberOfTickets;

			totalAmount += batchTotal;
			StringBuilder line = new StringBuilder();

			line.append(String.format("%d %s $%.2f (Day: %s", numberOfTickets, customerTypeName, batchTotal,
					selectedDay.toString()));
			if (dayDiscount > 0) {
				line.append(String.format(", Day Discount: %.0f%%", dayDiscount * 100));
			}
			if (customerDiscount > 0) {
				line.append(String.format(", Customer Type Discount: %.0f%%", customerDiscount * 100));
			}

			line.append(")\n");

			ticketDetails.append(line);

			// Ask user to add more tickets
			System.out.print("\nDo you want to add more tickets? (y/n): ");
			String response = scanner.nextLine().trim().toLowerCase();
			addMoreTickets = response.equals("y");
		}

		// Display ticket calculation details
		System.out.println("\nTicket Calculation Details:");
		System.out.println("---------------------------");
		System.out.println(ticketDetails);

		// Display final total amount
		System.out.printf("Final Total Amount: $%.2f%n", totalAmount);
		System.out.println("Enjoy the show!");
	}

}
