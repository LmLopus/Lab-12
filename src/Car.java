
public class Car {

	protected String make; 
	protected String model;
	protected int year; 
	protected double price;
	
	public Car() {
		
	}
	
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return String.format("%-12s %-12s %-12s $%-12s(Used)\n", this.getMake(), this.getModel(), this.getYear(), this.getPrice());
	}
	
	
	
}
