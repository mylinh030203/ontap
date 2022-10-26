package OOP;

import java.util.Scanner;

public class sinhvien {
	private String Masv;
	private String Name;
	private double Java;
	private double TDC;
	private double CSDL;
	
	public sinhvien() {
		
	}
	
	public sinhvien(String Masv, String Name, double Java, double TDC, double CSDl) {
		this.Masv = Masv;
		this.Name = Name;
		this.Java = Java;
		this.TDC = TDC;
		this.CSDL = CSDl;
		
	}
	
	public String getMasv() {
		return Masv;
	}
	public void setMasv(String masv) {
		Masv = masv;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getJava() {
		return Java;
	}
	public void setJava(double java) {
		Java = java;
	}
	public double getTDC() {
		return TDC;
	}
	public void setTDC(double tDC) {
		TDC = tDC;
	}
	public double getCSDL() {
		return CSDL;
	}
	public void setCSDL(double cSDL) {
		CSDL = cSDL;
	}
	
	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.println("Nhap ma sinh vien");
		this.Masv = sc.nextLine();
		System.out.println("Nhap ten");
		this.Name = sc.nextLine();
		System.out.println("Nhap diem Java");
		this.Java = sc.nextDouble();
		System.out.println("Nhap diem TDC");
		this.TDC = sc.nextDouble();
		System.out.println("Nhap diem CSDL");
		double CSDL = sc.nextDouble();
		setCSDL(CSDL);
		
	}
	
	public void output() {
		System.out.println("Ma sinh vien la: "+this.Masv);
		System.out.println("Ten sinh vien la: "+this.Name);
		System.out.println("Diem java cua "+getName()+" la: "+this.Java);
		System.out.println("Diem TDC cua "+getName()+" la: "+this.TDC);
		System.out.println("Diem CSDL cua "+getName()+" la: "+this.CSDL);
	}
	
	public double dtb() {
		double dtb = (this.Java+ this.TDC+ getCSDL())/3;
		return dtb;
	}
	
	

}
