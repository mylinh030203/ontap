package IT2B;

import java.util.Scanner;

public class sinhvien {
	private int masv;
	private String ten;
	private diem d;
	

	public sinhvien() {
		
	}
	public sinhvien(int masv, String Ten, diem d) {
		this.masv = masv;
		this.ten = Ten;
		this.d = d;
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
	
	public diem getD() {
		return d;
	}
	public void setD(diem d) {
		this.d = d;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		diem d = new diem();
		System.out.println("nhap vao diem toan ");
		double toan = sc.nextDouble();
		d.setToan(toan);
		System.out.println("nhap vao diem ly ");
		double ly = sc.nextDouble();
		d.setLy(ly);
		System.out.println("nhap vao diem hoa ");
		double hoa = sc.nextDouble();
		d.setHoa(hoa);
		sinhvien sv = new sinhvien();
		sv.setD(d);
		System.out.println(sv.getD().dtb());
		
	}

}
