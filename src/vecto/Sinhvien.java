package vecto;

import java.util.Scanner;

public class Sinhvien {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	
	private String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}


	private int getAge() {
		return age;
	}


	private void setAge(int age) {
		this.age = age;
	}


	public void input() {
		System.out.println("nhap ten");
//		this.name = sc.nextLine();
		String name = sc.nextLine();
		setName(name);
		System.out.println("Nhap tuoi");
		this.age = sc.nextInt();
		sc.nextLine();
		
	}
	
	
	public void output() {
		System.out.println("ten la: "+getName());
		
//		String name = sc.nextLine();
//		setName(name);
		System.out.println(" tuoi :"+this.age);
		
	}
	
}
