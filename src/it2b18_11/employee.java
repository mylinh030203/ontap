package it2b18_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class employee {
	private String id, name;
	private double salary;
	public employee() {
		
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		this.id = sc.nextLine();
		System.out.println("enter name: ");
		this.name = sc.nextLine();
		System.out.println("enter salary: ");
		this.salary = sc.nextDouble();
		sc.nextLine();
	}
	
	public void output() {
		System.out.println("id: "+this.id);
		System.out.println("name: "+this.name);
		System.out.println("salary: "+this.salary);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		sc.nextLine();
		employee e[] = new employee[n];
		for(int i= 0; i<n; i++) {
			e[i] = new employee();
			e[i].input();
		}
		Arrays.sort(e, new Comparator<employee>() {

			@Override
			public int compare(employee o1, employee o2) {
				// TODO Auto-generated method stub
				String name[] = o1.getName().split(" ");
				String name2[] = o2.getName().split(" ");
				
				return (int)(name[name.length-1].compareTo(name2[name2.length-1]));
			}
			
		});
//sắp xếp tăng dần: o1-o2, sắp xếp giảm dần o2-o1	
		for(int i =0; i<n; i++) {
			e[i].output();
		}
		
	}

}
