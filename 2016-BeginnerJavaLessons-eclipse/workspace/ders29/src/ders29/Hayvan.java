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
