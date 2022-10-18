package ders20;

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
		if (elemanSayisi == 0)
		{
			System.out.println("Zaten liste boþ!");
		}
		else if (index >= 0 && index <= elemanSayisi)
		{
			elemanSayisi--;
			sinir--;
		}
		else 
		{
			System.out.println("Yanlýþ girdi!");
		}
		
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

		
		if ((index <= elemanSayisi) && (index >= 0) && (elemanSayisi<sinir))
		{
			for(int i = elemanSayisi -1; i>=index   ; i--)
			{
				liste[i+1] = liste[i];
				
			}
			liste[index] = eklenecekEleman;
			elemanSayisi++;
		}
		else
		{
			System.out.println("Hata!");
		}
		
		

	}
	
	public void swap(int i1,int i2)
	{
		String tmp = liste[i1];
		liste[i1] = liste[i2];
		liste[i2] = tmp;

		
	}
	
	
}
