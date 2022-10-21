package OOP;

public class student {

	public static void main(String[] args) {
		int n = 2;
		sinhvien sv[] = new sinhvien[n];
		
		for(int i=0; i<n; i++) {
			sv[i] = new sinhvien();
			sv[i].input();
		}
		for(int i = 0; i<n; i++) {
			sv[i].output();
			System.out.println("Diem trung binh cua "+sv[i].getName()+" la: "+sv[i].dtb()); 
		}
//		sinhvien sv = new sinhvien();
//		sv.input();
//		sv.output();
//		System.out.println("diem trung binh cua sinh vien "+sv.getName()+" la :"+sv.dtb());
	}

}
