package vecto;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class vt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhaps");
		for(int i= 0; i<10; i++) {
			int d = sc.nextInt();
			v.add(d);
		}
//		Enumeration<Integer> e = v.elements();
//		while(e.hasMoreElements()) {
//			int s = (int)e.nextElement();
//			
//			System.out.println(s);
//		}
		for(int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}

	}

}
