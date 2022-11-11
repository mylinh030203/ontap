package IT2bn1;

import java.util.Scanner;

public class employeeManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		employee e[] = new employee[n];
		for(int i = 0; i<n; i++) {
			e[i] = new employee();
			e[i].input();
		}
		double min = e[0].getSalary();
		int indexM = 0;
		for(int i = 1; i<n; i++) {
//			String[] s = e[i].getFullname().split(" ");
//			if(s[s.length -1].equals("Pham"))
//				System.out.println(e[i].toString());
			if(min>e[i].getSalary()) {
				min=e[i].getSalary();
				indexM=i;
			}
		}
		System.out.println(e[indexM].toString());
		
		/*toi dang hoc java = s
		 * s.split(" ");
		 * s-> ["toi", "dang", "hoc", "java"]
		 * 
		 * */
	}

}
