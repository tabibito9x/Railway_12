package assignment4.ex5.entity;

public class NhanVien extends CanBo{
	
	private String congViec;
	
	public NhanVien(String name, int age, String gender, String address, String congViec) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Cong viec: " + congViec;
	}
}
