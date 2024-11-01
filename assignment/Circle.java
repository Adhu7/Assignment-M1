package assignment;

public class Circle {
private double radius;
private String color;

	public Circle() {
	super();
	this.radius = 1.0;
	this.color = "red";
}
	

	public Circle(double radius) {
		this.radius= radius;
		this.color="red";
}


	public Circle(double radius, String color) {
		this.radius= radius;
		this.color= color;
	}


	public double getRadius() {
		return radius;
	}


	public double getArea() {
		return radius*radius*Math.PI;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c1=new Circle();

System.out.println("c1: Radius= "+c1.getRadius()+",Area= "+c1.getArea());
	}

}
