package vecto;

import java.util.Scanner;

public class chuoi {
	
	// viết hàm đếm nguyen âm
	public static void dem() {
		
		System.out.println("nhap chuoi");
		Scanner sc = new Scanner(System.in);// TODO Auto-generated method stub
		
		int a[] = new int[3];
		String s = sc.nextLine();
		
		int kt=0;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='u') {
				kt++;
			}
			
		
		}
		System.out.println(kt);
	}

	public static void main(String[] args) {
		
		
		
		dem();
	}

}
