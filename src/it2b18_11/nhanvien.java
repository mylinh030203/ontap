package it2b18_11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class nhanvien {
	private String id;
	private String ten;
	private double luong;
	public nhanvien() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap id ");
		this.id = sc.nextLine();
		System.out.println("nhap ten ");
		this.ten = sc.nextLine();
		System.out.println("nhap luong ");
		this.luong = sc.nextDouble();
		sc.nextLine();
	}
	public void output() {
		System.out.println("id la: "+this.id);
		System.out.println("ten la: "+this.ten);
		System.out.println("luong la: "+this.luong);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong nhan vien ");
		int n = sc.nextInt();
		sc.nextLine();
		nhanvien nv[] = new nhanvien[n];
		for(int i= 0; i<n; i++) {
			nv[i] = new nhanvien();
			nv[i].input();
		}
//		Arrays.sort(nv, new Comparator<nhanvien>() {
//
//			@Override
//			public int compare(nhanvien o1, nhanvien o2) {
//				// TODO Auto-generated method stub
//				return (int)(o1.getLuong()-o2.getLuong());
//			}	
//		});
//nếu sắp xếp tăng dần o1-o2, neew sắp xếp giảm dần o2-o1
		Arrays.sort(nv, new Comparator<nhanvien>() {

			@Override
			public int compare(nhanvien o1, nhanvien o2) {
				// TODO Auto-generated method stub
				String []ten = o1.getTen().split(" ");
				String []ten2 = o2.getTen().split(" ");
//				String a = ten[ten.length-1];
//				String b = ten2[ten2.length-1];
				return (int)(ten[ten.length-1].compareTo(ten2[ten2.length-1]));
			}	
		});
		for(int i= 0; i<n; i++) {
			
			nv[i].output();
		}
	}
	
}

/*class sinh vien ten, tuoi, diem trung binh ->tìm những sinh viên có tên Hoa,
 * sắp xếp theo tên theo kiểu tăng dần(a-z)
 * tìm sinh vien có điểm thấp nhất ->dùng sắp xếp để tìm*/
