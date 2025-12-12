/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: (Give a brief description for each Class)
 * This project focuses on running a program that allows a customer to purchase tickets for a circus. This class creates arena object
 * Due: 12/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bhavya Aji
*/
public class Arena implements Building {
	// instance variables
	private String color;
	private double length;
	private double width;
	private String buildingType;

	// constructor
	public Arena(String color, double length, double width) {
		this.color = color;
		this.length = length;
		this.width = width;
		this.buildingType = "Arena";
	}

	@Override
	public void setSize(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setBuildingType(String type) {
		this.buildingType = type;
	}

	@Override
	public String getBuildingType() {
		return buildingType;
	}

	@Override
	public String toString() {
		return String.format(
				"Size (L*W) : " + length + " * " + width + "\nColor: " + color + "\nBuilding Type: " + buildingType);
	}

}
