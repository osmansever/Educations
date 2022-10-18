package ders32;

public class MatOgr extends Ogr implements Bil,Ciz {

	public MatOgr(String isim, int no) {
		super(isim,no);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void hesapla()
	{
		System.out.println("Hesapladým.");
	}


	@Override
	public void bolumSoyle() {
		// TODO Auto-generated method stub
		System.out.println("Benim bölümüm Mat");

	}


	@Override
	public void bilgisayardaYaz() {
		// TODO Auto-generated method stub
		System.out.println("Bilgisayarda yazdým." + getIsim());
	}


	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}


	@Override
	public void ciz() {
		// TODO Auto-generated method stub
	   System.out.println("Tamam çizdim.");
	}




}
