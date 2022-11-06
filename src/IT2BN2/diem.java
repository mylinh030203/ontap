package IT2BN2;

public class diem {
	private double toan, ly, hoa;
	public diem() {
		
	}
	public diem(double toan, double ly, double hoa) {
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}
	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}
	
	public double dtb() {
		return (this.toan+this.ly+this.hoa)/3;
	}

}
