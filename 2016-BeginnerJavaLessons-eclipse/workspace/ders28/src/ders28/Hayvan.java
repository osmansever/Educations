package ders28;

public class Hayvan {

	String isim;
	int yas;
	
	public Hayvan(String isim, int yas)
	{
		this.isim = isim;
		this.yas = yas;
		
	}
	
	public void yuru()
	{
		System.out.println("Yürüdüm");
	}
	public void yasSoyle()
	{
		System.out.println("Yaþým:" + yas  );
	}
	
	public void sesCýkar()
	{
		System.out.println("Ben bir hayvaným!");
	}
}
