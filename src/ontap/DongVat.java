package ontap;

import java.util.Scanner;

public abstract class DongVat {
	protected String Name;
	protected int age;
	protected String Gender;
	
	
	public DongVat() {
		
	}


	protected String getName() {
		return Name;
	}


	protected void setName(String name) {
		Name = name;
	}


	protected int getAge() {
		return age;
	}


	protected void setAge(int age) {
		this.age = age;
	}


	protected String getGender() {
		return Gender;
	}


	protected void setGender(String gender) {
		this.Gender = gender;
	}
	
	Scanner sc = new Scanner(System.in);
	protected void input() {
		System.out.println("Input name ");
		this.Name = sc.nextLine();
		
		System.out.println("Input age ");
		this.age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Input gender ");
		this.Gender = sc.nextLine();
	}
	
//	protected CompareTo
	public abstract int Compare() ;
	
	public String toString() {
		return "Name: "+this.Name+"\n"+"Age: "+this.age+"\n"+"Gender: "+this.Gender+"\n";
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
