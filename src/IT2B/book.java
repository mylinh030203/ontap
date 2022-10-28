package IT2B;

public class book {
	private String name;
	private int id;
	private double price;
	private int quantity;
	private author author;
	
	public book() {
		System.out.println("total price is "+totalPrice());	
	}
	
	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	 public author getAuthor() {
		return author;
	}



	public void setAuthor(author author) {
		this.author = author;
	}



	public void output() {
		 System.out.println("Name is "+this.name);
		 System.out.println("ID is "+this.id);
		 System.out.println("price is "+getPrice());
		 System.out.println("Quantity is "+getQuantity());
	 }
	 
	 public double totalPrice() {
		 return this.price*getQuantity();
	 }	
	public static void main(String[] args) {
		
		book b = new book();
		author a= new author();
		a.setName("abc");
		b.setAuthor(a);
		System.out.println(b.getAuthor().getName());
		b.output();
		
	}

}
