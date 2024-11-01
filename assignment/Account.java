package assignment;
import java.io.*;
public class Account {
double balance;

public Account(double initialbalance) {
	super();
	if (initialbalance>0.0) {
		this.balance = initialbalance;
	} else {
		this.balance = 0.0;
	}
}
	
	public void debit(double amount) {
		if (amount> balance) {
			System.out.println("Debit amount exceeded account balance. ");
		} else {
balance -=amount;
		}
	}


public double getBalance() {
	return balance;
}

}
