package BTVN;

import java.util.Scanner;

public class point {
	private double java, c, sql;

	public point() {
		
	}
	public point(double java, double c, double sql) {
		this.java = java;
		this.c = c;
		this.sql = sql;
	}
	public double getJava() {
		return java;
	}
	public void setJava(double java) {
		this.java = java;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getSql() {
		return sql;
	}
	public void setSql(double sql) {
		this.sql = sql;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter java point ");
		this.java = sc.nextDouble();
		System.out.print("Enter c point ");
		this.c = sc.nextDouble();
		System.out.print("Enter sql point ");
		this.sql = sc.nextDouble();
		sc.nextLine();
		
	}

	
	public double avgPoint() {
		return (this.java+this.c+this.sql)/3;
	}


}
