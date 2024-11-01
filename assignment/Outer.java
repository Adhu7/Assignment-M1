package assignment;

public class Outer {
public void display()
{
	System.out.println("Display in outer class");
}

 class Inner{
	public void display() {
		System.out.println("Display in inner class");
	}
}
}
