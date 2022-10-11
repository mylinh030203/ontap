package ontap;

import java.util.ArrayList;
import java.util.Scanner;

import ontap.DongVat;

class Dogs extends DongVat implements rate,weight{
	private double rate;
	private double weight;
	public Dogs() {
		super();
	}
	
	protected double getRate() {
		return rate;
	}

	protected void setRate(double rate) {
		this.rate = rate;
	}

	protected double getWeight() {
		return weight;
	}

	protected void setWeight(double weight) {
		this.weight = weight;
	}
	Scanner sc = new Scanner(System.in);
	
	protected void input() {
		super.input();
		System.out.println("Input rate ");
		this.rate = Double.parseDouble((sc.nextLine()));
		System.out.println("Input weight ");
		this.weight = Double.parseDouble((sc.nextLine()));
		
	}
	
	
	
	public String toString() {
		return super.toString()+"Rate: "+this.rate+"\n"+"Weight: "+this.weight+"\n";
	}
	public int Compare() {
		
		if(this.age>1) {
			return 1;
		}else {
			return 0;
		}

	}

	@Override
	public int rate() {
		if(this.rate>100) {
			return 1;
		}else {
			return 0;
		}
	}
	@Override
	public int weight() {
		if(this.weight>5) {
			return 1;
		}else {
			return 0;
		}
	}
	
}

class Cats extends DongVat implements weight{
	private double weight;
	
	
	public Cats() {
		super();
	}
	
	Scanner sc = new Scanner(System.in);
	protected double getWeight() {
		return weight;
	}
	protected void setWeight(double weight) {
		this.weight = weight;
	}
	protected void input() {
		super.input();
		
		System.out.println("Input weight ");
		this.weight = Double.parseDouble((sc.nextLine()));
		
	}
	
	public int Compare() {
		
		if(this.age>1) {
			return 1;
		}else {
			return 0;
		}

	}
	public String toString() {
		return super.toString()+"Weight: "+this.weight+"\n";
	}
	@Override
	public int weight() {
		if(this.weight>5) {
			return 1;
		}else {
			return 0;
		}
	}
	
}

class Horses extends DongVat implements  rate{
	private double rate;
	
	public Horses() {
		super();
	}
	
	Scanner sc = new Scanner(System.in);
	protected double getRate() {
		return rate;
	}

	protected void setRate(double rate) {
		this.rate = rate;
	}


	protected void input() {
		super.input();
		System.out.println("Input rate ");
		this.rate = Double.parseDouble((sc.nextLine()));
		
		
	}
	public int Compare() {
		
			if(this.age>1) {
				return 1;
			}else {
				return 0;
			}
	}

	public String toString() {
		return super.toString()+"Rate: "+this.rate+"\n";
	}

	

	
	public int rate() {
		if(this.rate>100) {
			return 1;
		}else {
			return 0;
		}
	}
	
}

public class DV {
	
	

	public static void main(String[] args) {
		ArrayList<DongVat> ListDV = new ArrayList<DongVat>();
		ArrayList<Dogs> ListDogs = new ArrayList<Dogs>();
		ArrayList<Cats> ListCats = new ArrayList<Cats>();
		ArrayList<Horses> ListHorses = new ArrayList<Horses>();
		//input  Dog
		for(int i =1; i<=2; i++) {
			System.out.println("input the dog number "+i);
			Dogs dg = new Dogs();
			dg.input();
			ListDV.add(dg);
		}
		
		
		//input  cat
		for(int i =1; i<=2; i++) {
			System.out.println("input the cat number "+i);
			Cats ct = new Cats();
			ct.input();
			ListDV.add(ct);
		}
		
		
		//input  horse
		for(int i =1; i<=2; i++) {
			System.out.println("input the horse number "+i);
			Horses hr = new Horses();
			hr.input();
			ListDV.add(hr);
		}
		
		//output
		System.out.println("----List DV----");
		for (DongVat dv : ListDV) {
			if(dv.getClass() == Dogs.class)
				System.out.println((((Dogs)dv).toString()));
			if(dv.getClass() == Cats.class)
				System.out.println((((Cats)dv).toString()));
			if(dv.getClass() == Horses.class)
				System.out.println((((Horses)dv).toString()));
		}
		
		//age >1
		System.out.println("List Dv have age >1");
		for (DongVat dv : ListDV) {
			if(dv.getClass() == Dogs.class && dv.Compare()==1)
				System.out.println((((Dogs)dv).toString()));
			if(dv.getClass() == Cats.class&&dv.Compare()==1)
				System.out.println((((Cats)dv).toString()));
			if(dv.getClass() == Horses.class&&dv.Compare()==1)
				System.out.println((((Horses)dv).toString()));
//			if(dv.Compare()==1)
//				System.out.println(dv.toString());
//			
		}

		
		//rate >100
		System.out.println("List DV have rate >100");
		for (DongVat dv : ListDV) {
			if(dv.getClass() == Dogs.class) {
				if(((Dogs)dv).rate()==1)
				System.out.println(((Dogs)dv).toString());
			}if(dv.getClass() == Horses.class) {
				if(((Horses)dv).rate()==1)
				System.out.println(((Horses)dv).toString());
			}
		}
		
		
		
		
		//weight >5
		System.out.println("List Dog have weight >5");
		for (DongVat dv : ListDV) {
			
			if(dv.getClass() == Cats.class) {
		
				if(((Cats)dv).weight()==1)
					System.out.println(((Cats)dv).toString());
		}	
			if(dv.getClass() == Dogs.class) {
				if(((Dogs)dv).weight()==1)
					System.out.println(((Dogs)dv).toString());
			}
		}
	}
}
