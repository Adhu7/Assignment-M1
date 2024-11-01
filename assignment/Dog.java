package assignment;

public class Dog extends Animal {
String breed, color;
int age;


	//public Dog(String breed, String color, int age) {
//	super();
//	this.breed = breed;
//	this.color = color;
//	this.age = age;
//}
	void bark() {System.out.println("barking..");}
	void sleep() {System.out.println("sleeping..");}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
d.bark();
d.sleep();

	}

}
