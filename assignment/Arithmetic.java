package assignment;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1= new Scanner(System.in);
System.out.println("Enter the first number: ");
int num1= s1.nextInt();
System.out.println("Enter the second number: ");
int num2= s1.nextInt();
 int sum= num1 + num2;
 int sub= num1-num2;
 int product= num1*num2;
 int divide= num1/num2;
 int modulas= num1%num2;
 System.out.println(num1+"+"+num2+"="+sum);
 System.out.println(num1+"-"+num2+"="+sub);
 System.out.println(num1+"x"+num2+"="+product);
 System.out.println(num1+"/"+num2+"="+divide);
 System.out.println(num1+"mod"+num2+"="+modulas);
 
	}

}
