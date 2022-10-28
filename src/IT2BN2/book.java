package IT2BN2;

public class book {
	
	private String name;
	private double price;
	private int quantity;
	private author author;
	
	public book() {
		
	}
	
//	public book(String name, double price, int quantity, author author) {
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//		this.author = author;
//		System.out.println("havana");
//		
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double totalPrice() {
		return this.price*this.quantity;
	}
	
	public author getAuthor() {
		return author;
	}

	public void setAuthor(author author) {
		this.author = author;
	}

	public void output() {
		System.out.println("Name is "+this.name);
		System.out.println("price is "+this.price);
		System.out.println("quantity is "+this.quantity);
		System.out.println("total price is "+totalPrice());
	}
	public static void main(String[] args) {
		
		book b = new book();
		author a = new author("1");
		b.setAuthor(a);
		System.out.println(b.getAuthor().getName());
		
		
		
		
	}
	/*
	 sử dụng constructor có tham số, viết hàm tính tổng giá = giá*số lượng
	 viết hàm in ra màn hình.
	 gọi hàm in ra màn hình và in ra tổng giá( sử dụng dữ liệu truyền vào bằng
	 constructor có tham số)
	 */

}
