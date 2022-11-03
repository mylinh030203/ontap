package DA2;

import java.util.Scanner;

public class book {
	private int maSach;
	private String tenSach;
	private author Author;
	
	public book() {
//		this.maSach =1;
//		this.tenSach ="a";
		System.out.println("abc");
	}
	public book(int maSach, String tenSach) {
		this.maSach = maSach;
		this.tenSach = tenSach;
		System.out.println("VKU");
	}
//	

	public int getMaSach() {
		return maSach;
	}




	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}




	public String getTenSach() {
		return tenSach;
	}




	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	




	public author getAuthor() {
		return Author;
	}
	public void setAuthor(author author) {
		Author = author;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
//		int a = sc.nextInt();
//		sc.nextLine();
//		String e = sc.nextLine();
		book b = new book();
		author a = new author();
		a.setTenTG("y");
		b.setAuthor(a);
		System.out.println(b.getAuthor().getTenTG());
		
		
		//sinhvien: int masv, string ten, diem diem;
		//diem: double toan, ly , hoa, diemtrungbinh;
		
		//int ra ten sv va diem trung binh co su dung constructor
	}

}
