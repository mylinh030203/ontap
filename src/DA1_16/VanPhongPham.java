package DA1_16;

import java.util.Scanner;

public class VanPhongPham {
	private String id;
	private int soluong;
	private double dongia;
	public VanPhongPham() {
		
	}
	public VanPhongPham(String id, int soluong, double dongia) {
		this.id = id;
		this.soluong = soluong;
		this.dongia = dongia;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao id: ");
		this.id = sc.nextLine();
		System.out.println("nhap vao so luong: ");
		this.soluong = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap vao don gia: ");
		this.dongia =  sc.nextDouble();
		sc.nextLine();
	}
	public double tonggia() {
		return this.soluong*this.dongia;
	}
	public String toString() {
		return "id: "+this.id+"\n"+"tong gia: "+tonggia()+" \n";
	}
	public static void main(String[] args) {
		System.out.println("nhap so phan tu cua mang ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		VanPhongPham vpp[] = new VanPhongPham[n];
		for(int i=0; i<n; i++) {
			vpp[i] = new VanPhongPham();
			vpp[i].input();
		}
		for(int i =0; i<n; i++) {
			System.out.println(vpp[i].toString());
		}
		double min = vpp[0].tonggia();
		int indexMin =0;
		for(int i = 1; i<n; i++) {
			if(min>vpp[i].tonggia()) {
				min = vpp[i].tonggia();
				indexMin =i;
			}
		}
		System.out.println("vpp co tong gia thap nhat ");
		System.out.println(vpp[indexMin].toString());
		System.out.println("\n");
		System.out.println("vpp co id bat dau bang a ");
		for(int i =0; i<n; i++) {
			if(vpp[i].getId().startsWith("a"))
				System.out.println(vpp[i].toString());
		}
	}
}

/*Viết 1 class văn phòng phẩm có ID, số lượng, đơn giá.
 * Sử dụng mảng
 * viết các constructor
 * Viết các hàm nhập xuất, tính tổng giá = số lượng* đơn giá
 * In ra đối tượng có tổng giá thấp nhất
 * In ra đối tượng có ID bắt đầu bằng "a"
 * */
