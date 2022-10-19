package vecto;

import java.util.Scanner;



public class Tong {
	public static int Tong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu cua mang");
		int n = sc.nextInt();
		int arr[] = new int [n];
		int s = 0;
		System.out.println("Nhap vao cac phan tu mang ");
		for(int i = 0; i<n; i++) {
			arr[i]= sc.nextInt();
			s = s+arr[i];
		}
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tong mang la "+Tong());
		
//		Tong();
	}

}














