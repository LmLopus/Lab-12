import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering?");
		int numberOfCars = scnr.nextInt();
//		Array[] cars = new Array[numberOfCars];
		List<Car> cars = new ArrayList<>();
		Car c = null;
		for (int i = 0; i < numberOfCars; i++) {
			c = new Car();
			System.out.println("Please enter the make:");
			c.setMake(scnr.next());
			System.out.println("Please enter the model:");
			c.setModel(scnr.next());
			System.out.println("Please enter the year:");
			c.setYear(scnr.nextInt());
			System.out.println("Please enter the price:");
			c.setPrice(scnr.nextDouble());
			cars.add(c);
			
		}
		System.out.println("Current Inventory:");
		for (Car car : cars) {
			
			System.out.printf("%-12s %-12s %-12s $%-12s\n", c.getMake(), c.getModel(), c.getYear(), c.getPrice());
			
		}
		
	}

}
