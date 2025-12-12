/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: (Give a brief description for each Class)
 * This project focuses on running a program that allows a customer to purchase tickets for a circus. This class focuses on pricing
 * Due: 12/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bhavya Aji
*/

public class Ticket {
	private double basePrice;
	private String dayOfWeek;
	private int age;

	public Ticket(String dayOfWeek, double basePrice, int age) {
		this.basePrice = basePrice;
		this.age = age;
		this.dayOfWeek = dayOfWeek.toLowerCase();
	}

	public double calculatePrice() {
		double finalPrice = basePrice;
		double discount = 0.0;

		if (age == 10) {
			discount += 0.10;
		} else if (age == 20) {
			discount += 0.10;
		} else if (age == 70) {
			discount += 0.05;
		} else {
			discount = discount;
			// in class I was told never to leave an if else without
			// a final else, although this statement does nothing,
			// I just wanted to add it in case! :)
		}
		if (!dayOfWeek.equals("saturday") && !dayOfWeek.equals("sunday")) {
			discount += 0.10;
		}

		finalPrice *= (1 - discount);
		return finalPrice;
	}

	// Display the ticket details
	public void displayTicketDetails() {
		System.out.printf("Ticket Details: [Age: %d, Day: %s, Price: $%.2f]%n", age,
				dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1), calculatePrice());
	}

	@Override
	public String toString() {
		return String.format("Ticket [Day: %s, Age: %d, Price: $%.2f]",
				dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1), age, calculatePrice());
	}
}
