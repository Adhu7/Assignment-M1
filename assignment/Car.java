package assignment;

class Car {
	String model;
	int price;
	
	
	public Car() {
		super();
	}
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	void start() {System.out.println("Car Starts..");}
	void stop() {System.out.println("Car Stops..");}
	void move() {System.out.println("Car is moving");}
	

}
