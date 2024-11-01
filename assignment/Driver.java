package assignment;

public class Driver extends Car {
String name;
int age;



	public Driver() {
	super();
}
	public Driver(String model, int price) {
	super(model, price);
}
	public Driver(String model, int price, String name, int age) {
	super(model, price);
	this.name = name;
	this.age = age;
}
void drive() {System.out.println("Driving..");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Driver d=new Driver();
d.drive();
Car c=new Car();
c.start();
c.stop();
c.move();
	}

}
