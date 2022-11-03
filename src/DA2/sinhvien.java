package DA2;

public class sinhvien {
	private String ten;
	private diem diem;
	public sinhvien(String ten, diem diem) {
		
		this.ten = ten;
		this.diem = diem;
	}
	public sinhvien() {
	
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public diem getDiem() {
		return diem;
	}
	public void setDiem(diem diem) {
		this.diem = diem;
	}
	
	public static void main(String[] args) {
		diem d = new diem(10,9,10);
		
		sinhvien sv = new sinhvien("havana",d);
		
		
		
		System.out.println(sv.getTen());
		System.out.println(sv.getDiem().Diemtrungbinh());
	}
	
	
	
	

}
