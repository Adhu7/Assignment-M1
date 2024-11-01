package assignment;

public class Employee {
String firstname, secondname;
double salary;
public Employee(String firstname, String secondname, double salary) {
	super();
	this.firstname = firstname;
	this.secondname = secondname;
	this.salary = salary > 0 ? salary: 0.0;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSecondname() {
	return secondname;
}
public void setSecondname(String secondname) {
	this.secondname = secondname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary > 0 ? salary:0.0;
}
public double getYearlySalary(){
	return salary*12;
}
public double giveRaise() {
	return this.salary*=1.10;
}
}
