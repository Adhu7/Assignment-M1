package assignment;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1 = new Scanner(System.in);
System.out.println("Enter the first number:  ");
int num1=s1.nextInt();
System.out.println("Enter the second number: ");
int num2=s1.nextInt();
int product=num1*num2;
System.out.println(num1+"x"+num2+"="+product);
	}

}
