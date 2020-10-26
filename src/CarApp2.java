import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	static List<Car> newAndUsedCars = new ArrayList<>();
	
public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		newAndUsedCars = new ArrayList<>();
		
		UsedCar a = new UsedCar("Honda", "Civic", 2003, 13000.00, 20.3);
		newAndUsedCars.add(a);
		Car b = new Car("Chevy", "Malibu", 2014, 30000.00);
		newAndUsedCars.add(b);
		UsedCar c = new UsedCar("Toyota", "Camry", 2010, 15000.00, 29.5);
		newAndUsedCars.add(c);
		Car d = new Car("Dodge", "Charger", 2018, 50000.00);
		newAndUsedCars.add(d);
		UsedCar e = new UsedCar("Ford", "F150", 2013, 23000.00, 16);
		newAndUsedCars.add(e);
		Car f = new Car("Audi", "R8", 2020, 170000.00);
		newAndUsedCars.add(f);
	boolean flag = true;
		do {	
		int i = 1;
		for (Car car: newAndUsedCars) {
			if (car instanceof UsedCar)	{
				System.out.printf(i + ". %-12s %-12s %-12s $%-12s %-12s\n", car.getMake(), car.getModel(), car.getYear(), car.getPrice(), ((UsedCar) car).getMileage());
				i++;
			}else if(car instanceof Car) {
				System.out.printf(i + ". %-12s %-12s %-12s $%-12s\n", car.getMake(), car.getModel(), car.getYear(), car.getPrice());
				i++;
			}
		}
		System.out.println(i + ". Quit");
		System.out.println("Which car would you like?");
		int carChoice = scnr.nextInt() - 1;
		if (carChoice >= 0 && carChoice < newAndUsedCars.size()) {
			System.out.println((newAndUsedCars.get(carChoice).toString()));
			System.out.println("Would you like to purchase the car? yes or no");
			String yesOrNo = scnr.next();
			if (yesOrNo.equalsIgnoreCase("yes")) {
				System.out.println("Excellent! Ourt finance department will be in touch shortly");
				System.out.println("Lets look again!");
				newAndUsedCars.remove(carChoice);
			}
			else if (yesOrNo.equalsIgnoreCase("no")) {
				System.out.println("Okay. Lets look again.");
			}
			else {
				System.out.println("That answer was not valid");
			}
		}
		else {
			System.out.println("Have a great day!");
			flag = false;
		}
	
	}while(flag);
	}

	
}
