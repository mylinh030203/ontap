package vecto;

import java.util.Scanner;

public class Sinhvien {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private double toan;
	private double ly;
	private double hoa;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getToan() {
		return toan;
	}


	public void setToan(double toan) {
		this.toan = toan;
	}


	public double getLy() {
		return ly;
	}


	public void setLy(double ly) {
		this.ly = ly;
	}


	public double getHoa() {
		return hoa;
	}


	public void setHoa(double hoa) {
		this.hoa = hoa;
	}


	public void input() {
		System.out.println("nhap ten");
//		this.name = sc.nextLine();
		String name = sc.nextLine();
		setName(name);
		System.out.println("Nhap tuoi");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap diem toan");
		this.toan = sc.nextDouble();
		System.out.println("nhap diem ly");
		this.ly = sc.nextDouble();
		System.out.println("nhap diem hoa");
		this.hoa = sc.nextDouble();
	}
	
	
	public void output() {
		System.out.println("ten la: "+getName());
		
//		String name = sc.nextLine();
//		setName(name);
		System.out.println(" tuoi :"+this.age);
		
	}
	public double diemtrungbinh() {
		double dtb = (this.toan + this.ly + this.hoa)/3;
		
		
		return dtb;
	}
	
}
