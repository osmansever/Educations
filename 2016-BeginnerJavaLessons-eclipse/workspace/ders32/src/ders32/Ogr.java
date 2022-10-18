package ders32;

public abstract class Ogr {

	private String isim;
	private int no;
	
	public Ogr(String isim, int no) {
		this.isim = isim;
		this.no = no;
	}
	
	public void adSoyle()
	{
		System.out.println("Adým: " + isim);
	}
	
	public abstract void bolumSoyle();
	
	
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
}
