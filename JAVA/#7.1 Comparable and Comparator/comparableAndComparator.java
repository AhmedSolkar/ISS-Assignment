// Comporable and Comparator

import java.io.*;
import java.util.*;

// A class 'Car' that implements Comparable
class Car implements Comparable<Car> {
	private String name;
	private int year;

	// Used to sort Cars by year
	public int compareTo(Car m)
	{
		return this.year - m.year;
	}

	// Constructor
	public Car(String nm, int yr)
	{
		this.name = nm;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public String getName() { return name; }
	public int getYear() { return year; }
}

// Class to compare Cars by name
class NameCompare implements Comparator<Car> {
	public int compare(Car c1, Car c2)
	{
		return c1.getName().compareTo(c2.getName());
	}
}

class comparableAndComparator {
	public static void main(String[] args)
	{
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(new Car("Skoda superb", 2019));
		list.add(new Car("Audi R8", 2006));
		list.add(new Car("Mahindra Scorpio", 2009));
		list.add(new Car("Honda City", 2011));


		// Call overloaded sort method with NameCompare uses Comparator
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Car car : list)
			System.out.println(car.getName() + " "+ car.getYear());

		// Uses Comparable to sort by year
		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (Car car : list)
			System.out.println(car.getYear() + " " + car.getName() + " ");
	}
}
