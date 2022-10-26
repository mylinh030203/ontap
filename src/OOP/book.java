package OOP;

import java.util.Scanner;

public class book {
	private String name;
	private double price;
//	private double quantity;
	
	public book() {
//		input();
//		output();
		
	}
	
	public book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("Ten cua sach la: ");
		String name = sc.nextLine();
		setName(name);
		System.out.println("Gia cua sach la: ");
		this.price = sc.nextDouble();
		sc.nextLine();
	}
	
	public void output() {
		System.out.println("Ten cua sach: "+getName());
		
		System.out.println("gia cua sach: "+this.price);
	}
	
	public static void main(String[] args) {
		book b = new book("1",1);
		b.input();
		b.output();
	}

}

//tinh tong gia trong ham kt co tham so
//nhap gia tri bang ham input
//su dung ham khoi tao mac dinh
