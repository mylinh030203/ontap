package IT2B;

public class diem {
	private double toan, ly, hoa;
	public diem() {
		
	}
	public diem(double toan, double ly, double hoa) {
		this.hoa = hoa;
		this.ly = ly;
		this.toan = toan;
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
		return (this.hoa+this.ly+this.toan)/3;
	}

}
