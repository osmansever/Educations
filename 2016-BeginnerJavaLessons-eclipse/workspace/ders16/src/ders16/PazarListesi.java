package ders16;

public class PazarListesi {

	String[] liste;
	int elemanSayisi;
	int sinir;
	
	public PazarListesi(int elemanKapasitesi)
	{
		liste = new String[elemanKapasitesi];
		elemanSayisi= 0;
		sinir = elemanKapasitesi;
		
	}
	
	public void listeyeEkle(String eklenecekOlan)
	{
		
		if (elemanSayisi < sinir)
		{
			liste[elemanSayisi] = eklenecekOlan;
			elemanSayisi++;
		}
		else 
		{
			System.out.println("Liste dolu!");
		}
	}
	
	public void yaz()
	{
		for (int i = 0;i < sinir;i++)
			{
				System.out.println(liste[i]);
			}
		
		
	}
	
}
