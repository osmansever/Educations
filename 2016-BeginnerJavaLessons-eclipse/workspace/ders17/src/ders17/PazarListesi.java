package ders17;

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
		System.out.println();

		
	}
	
	public void sondanSil()
	{
		if (elemanSayisi > 0)
		{
			elemanSayisi--;
			liste[elemanSayisi] = " ";
		}
		else
		{
			System.out.println("Liste zaten boþ!");
		}
		
		
	}
	
	public void bastanSil()
	{
		for(int i = 0; i<elemanSayisi  ; i++)
		{
			liste[i] = liste [i+1];
			
		}
		elemanSayisi--;

		
	}
}
