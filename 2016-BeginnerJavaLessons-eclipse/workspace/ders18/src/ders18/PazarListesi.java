package ders18;

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
	
	
	
	public void sil(int index)
	{
		for(int i = index; i<elemanSayisi -1   ; i++)
		{
			liste[i] = liste[i+1];
			
		}
		elemanSayisi--;
		sinir--;
	}
	
	public void ekle(String eklenecekEleman, int index)
	{
		//Burada sýnýrýn dýþýnda ekleme yapýlabilmesi için çalýþýlacak.
		/*if (index <= sinir)
		{
			sinir++;

		}
		else 
		{
			String liste[sinir];
		    liste = Arrays.copyOf(liste, liste.length+1);
		}
		*/
		sinir++;

		for(int i = elemanSayisi -1; i>=index   ; i--)
		{
			liste[i+1] = liste[i];
			
		}
		liste[index] = eklenecekEleman;
		elemanSayisi++;
		

	}
	
	
	
}
