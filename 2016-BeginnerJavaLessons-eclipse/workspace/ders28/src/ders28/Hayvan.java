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
		System.out.println("Y�r�d�m");
	}
	public void yasSoyle()
	{
		System.out.println("Ya��m:" + yas  );
	}
	
	public void sesC�kar()
	{
		System.out.println("Ben bir hayvan�m!");
	}
}
