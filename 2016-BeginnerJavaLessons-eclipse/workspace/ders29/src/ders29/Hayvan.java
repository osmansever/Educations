package ders29;

public class Hayvan {

	String isim;
	int yas;
	
	public Hayvan(String isim, int yas)
	{
		this.isim = isim;
		this.yas = yas;
		
	}
	public int islemYap(int a,int b)
	{
		
		return a*(b+3);
		
	}
	
	public void yuru()
	{
		System.out.println("Yürüdüm");
	}
	public void yasSoyle()
	{
		System.out.println("Yaşım:" + yas  );
	}
	
	public void sesCıkar()
	{
		System.out.println("Ben bir hayvanım!");
	}
}
