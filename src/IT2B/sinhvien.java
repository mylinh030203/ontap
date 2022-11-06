package IT2B;

import java.util.Scanner;
import java.util.Vector;

public class sinhvien {
	private int masv;
	private String ten;
	
	
	Vector<sinhvien> vtSinhvien = new Vector<sinhvien>();
	

	public sinhvien() {
		
	}
	public sinhvien(int masv, String Ten ) {
		this.masv = masv;
		this.ten = Ten;
		
		System.out.println("a");
	}
	

	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	

	public void input() {
		Scanner sc = new Scanner(System.in);
		this.masv = sc.nextInt();
		this.ten = sc.nextLine();
	}
	
	public void add() {

		for(int i = 0; i< 2; i++) {
			sinhvien sv = new sinhvien();
			sv.input();
			vtSinhvien.add(sv);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sinhvien sv = new sinhvien();
		
		
	}

}
