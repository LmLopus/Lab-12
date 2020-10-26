import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsedCar extends Car{

	private double mileage;
	
	
public double getMileage() {
		return mileage;
	}
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format("%-12s %-12s %-12s $%-12s(Used) %-12s\n", this.getMake(), this.getModel(), this.getYear(), this.getPrice(), this.getMileage());
	}
	
	
	
	
}
