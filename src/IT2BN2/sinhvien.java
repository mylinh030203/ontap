package IT2BN2;

public class sinhvien {
	private int masv;
	private String name;
	private diem diem;
	public sinhvien() {
		
	}
	
	public sinhvien(int masv, String name, diem diem) {
		this.masv = masv;
		this.name = name;
		this.diem = diem;
		System.out.println("abc");
	}

	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public diem getDiem() {
		return diem;
	}

	public void setDiem(diem diem) {
		this.diem = diem;
	}

	public static void main(String[] args) {
		diem d = new diem(8,9,6);
		
		sinhvien sv = new sinhvien(1,"afdsdaf",d);
		
		
		System.out.println(sv.getDiem().dtb());
	}
	///in ra 5,6666666 
	//in ra vung nho cua d
	//8.0
	
	
}
