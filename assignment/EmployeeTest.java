package assignment;

public class EmployeeTest extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee("Akhil", "P A", 30000.0);
Employee emp1=new Employee("John", "Samuel", 35000.0);

System.out.println(emp.getFirstname()+" "+emp.getSecondname()+"'s yearly salary:$ "+emp.getSalary());
System.out.println(emp1.getFirstname()+" "+emp1.getSecondname()+"'s yearly salary:$ "+emp1.getSalary());

emp.giveRaise();
emp1.giveRaise();

System.out.println(emp.getFirstname()+" "+emp.getSecondname()+"'s yearly salary after 10% raise:$ "+emp.getSalary());
System.out.println(emp1.getFirstname()+" "+emp1.getSecondname()+"'s yearly salary after 10% raise:$ "+emp1.getSalary());
	}

}
