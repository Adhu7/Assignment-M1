package assignment;

public class Arithemetics implements Test {
public int square(int a) {
	return a*a;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Arithemetics ar=new Arithemetics();
int result=ar.square(11);
System.out.println("Square is: "+result);
	}

}
