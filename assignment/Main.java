package assignment;

import assignment.Outer.Inner;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer out=new Outer();
out.display();
Outer.Inner in= out.new Inner();
in.display();
	}

}
