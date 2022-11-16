package DA1_16;

import java.util.Scanner;

public class baitap {
	private String id;
	private int quantity;
	private double unitPrice;
	public baitap() {
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id ");
		this.id = sc.nextLine();
		System.out.println("Enter quantity ");
		this.quantity = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter unit price ");
		this.unitPrice = sc.nextDouble();
		sc.nextLine();
	}
	public double price() {
		return this.unitPrice*this.quantity;
	}
	
	public void output() {
		System.out.println("id: "+this.id);
		System.out.println("Quantity: "+this.quantity);
		System.out.println("Unit price: "+this.unitPrice);
		System.out.println("Price: "+price());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n ");
		int n = sc.nextInt();
				sc.nextLine();
		baitap bt[] = new baitap[n];
		for(int i= 0; i<n; i++) {
			bt[i] = new baitap();
			bt[i].input();
		}
		for(int i= 0; i<n; i++) {
			bt[i].output();
		}
		double min = bt[0].price();
		int indexMin = 0;
		
		for(int i= 1; i<n; i++) {
			if(min>bt[i].price()) {
				min = bt[i].price();
				indexMin = i;
			}
		}
		System.out.println("\n");
		System.out.println("price min ");
		bt[indexMin].output();
		System.out.println("\n");
		System.out.println("start with a");
		for(int i =0; i<n; i++) {
			if(bt[i].getId().startsWith("a")){
				bt[i].output();
			}
		}
	}

}
