import java.util.Scanner;

public class Employee {
int employeeid;
String employeename;
int employeesalary;
char active;


public Employee(int employeeid, String employeename, int employeesalary, char active) {
	super();
	this.employeeid = employeeid;
	this.employeename = employeename;
	this.employeesalary = employeesalary;
	this.active = active;
}

public void acceptdetails() {
	Scanner sc=new  Scanner(System.in);
	System.out.println("Enter employeeid, employeename, employeesalary, active status(Y/N)");
	employeeid=sc.nextInt();
	employeename= sc.next();
	employeesalary=sc.nextInt();
	active=sc.next().charAt(0);
}

public void displaydetails() {
	System.out.println("Employee details as follows");
	System.out.println("Employee Id "+ employeeid);
	System.out.println("Employee Name "+ employeename);
	System.out.println("Employee Salary "+ employeesalary);
	System.out.println("Status " + active);
	System.out.println("==================================");
	
}
}
