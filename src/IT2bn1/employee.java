package IT2bn1;

import java.util.Scanner;

public class employee {
	private int id;
	private String fullname;
	private double salary;
	
	public employee() {
		
	}
	public employee(int id, String fullname, double salary) {
		this.id = id;
		this.fullname = fullname;
		this.salary = salary;	
	}
	public employee(employee e ) {
		this.id = e.id;
		this.fullname = e.fullname;
		this.salary = e.salary;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id's employee ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter fullname's employee ");
		this.fullname = sc.nextLine();
		System.out.print("Enter salary's employee ");
		this.salary = sc.nextDouble();
		sc.nextLine();
	}
	public String toString() {
		return "Id is "+this.id+"\n"+"Fullname is "+this.fullname+
				"\n"+"Salary is "+this.salary;
	}
	
	
	

}
