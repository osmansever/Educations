package ders9;

public class Bisiklet {

	Insan binmisInsan;
	
	public Bisiklet()
	{
		binmisInsan = null;
	
	}
	
	public Bisiklet(Insan gelenInsan)
	{
		binmisInsan = gelenInsan;
		
	}
	
	public void bin(Insan gelenInsan)
	{
		if(binmisInsan == null)
		{
			binmisInsan = gelenInsan;
			System.out.println(gelenInsan.getIsim() + " bindi.");

		}
		else
		{
			
			System.out.println("Zaten " + binmisInsan.getIsim() + " binmi�.");
		}
		
	}
	
	public void in()
	{
		if(binmisInsan == null)
		{
			System.out.println("Bisiklet zaten bo�.");

		}
		else
		{
			String a = binmisInsan.getIsim();
			binmisInsan = null;
			System.out.println( a + " indi.");
		}
		
	}

	
}
