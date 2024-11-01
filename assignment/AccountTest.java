package assignment;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acc=new Account(500.0);

System.out.println("Initial balance: "+acc.getBalance());
System.out.println("\nAttempting to debit $350.0 from Account...");
acc.debit(350);
System.out.println("Account balance: "+acc.getBalance());



	}

}
