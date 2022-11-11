package BTVN;

import java.util.Iterator;
import java.util.Scanner;

public class student {
	private String stCode, name;
	private point point;
	
	public student() {
		
	}
	public student(String stCode, String name, point point) {
		this.name = name;
		this.point = point;
		this.stCode = stCode;
	}
	
	
	public String getStCode() {
		return stCode;
	}
	public void setStCode(String stCode) {
		this.stCode = stCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public point getPoint() {
		return point;
	}
	public void setPoint(point point) {
		this.point = point;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		point p = new point();
		System.out.print("Enter student code ");
		this.stCode = sc.nextLine();
		System.out.print("Enter student name ");
		this.name = sc.nextLine();
		System.out.println("------Input student point------");
		this.point = p;
		getPoint().input();
	}
	public void output() {
		System.out.println("Student code: "+getStCode());
		System.out.println("Name: "+getName());
		System.out.println("Java point "+getName()+"'s: "+getPoint().getJava());
		System.out.println("C point "+getName()+"'s: "+getPoint().getC());
		System.out.println("SQL point "+getName()+"'s: "+getPoint().getSql());
		System.out.println("Average point "+getName()+"'s: "+getPoint().avgPoint());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int n = sc.nextInt();
		sc.nextLine();
		student st[] = new student[n];
		for(int i=0; i<2; i++) {
			System.out.println("------Enter student "+(i+1)+"------");
			st[i] = new student();
			st[i].input();
			
		}
		for(int i=0 ; i<2; i++) {
			System.out.println("------Show student "+(i+1)+"------");
			st[i].output();
		}
		

	}

}
