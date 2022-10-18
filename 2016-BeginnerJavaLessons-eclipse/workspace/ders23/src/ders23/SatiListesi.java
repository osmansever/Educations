package ders23;

public class SatiListesi {

	
	int[] liste;
	int elemanSayisi;
	int sinir;
	
	public SatiListesi(int elemanKapasitesi)
	{
		liste = new int[elemanKapasitesi];
		elemanSayisi= 0;
		sinir = elemanKapasitesi;
		
	}
	
	public void listeyeEkle(int eklenecekOlan)
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
				System.out.print(liste[i] + " ");
			}
		

		
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
	
	public void ekle(int eklenecekEleman, int index)
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
			elemanSayisi++;
			liste[index] = eklenecekEleman;
			
		}
		else
		{
			System.out.println("Hata!");
		}
		
		

	}
	
	public void swap(int i1,int i2)
	{
		int tmp = liste[i1];
		liste[i1] = liste[i2];
		liste[i2] = tmp;

		
	}
	
	
	public int max()
	{
		int enBuyuk = liste[0];
		for (int i = 0; i< elemanSayisi; i++)
		{
			if (liste[i] > enBuyuk)
			{
				enBuyuk = liste[i];
			}
		}
		return enBuyuk;
		
	}
	
	
	public int min()
	{
		int enKucuk = liste[0];
		for (int i = 0; i< elemanSayisi; i++)
		{
			if (liste[i] < enKucuk)
			{
				enKucuk = liste[i];
			}
		}
		return enKucuk;
		
	}
	
	public void selectionSort()
	{
	
		int enKucukIndex;
		
		for(int i = 0;i< elemanSayisi;i++)
		{
			enKucukIndex = i;
			for(int j=i; j < elemanSayisi ; j++)
			{
				
			
				if (liste[j] < liste[enKucukIndex])
				{
					enKucukIndex = j;
			
				}
			}
			swap(enKucukIndex, i);
			
		}
	}
	
	
	public void selectionSortTers()
	{
	
		int enBuyukIndex;
		
		for(int i = 0;i< elemanSayisi;i++)
		{
			enBuyukIndex = i;
			for(int j=i; j < elemanSayisi ; j++)
			{
				
			
				if (liste[j] > liste[enBuyukIndex])
				{
					enBuyukIndex = j;
			
				}
			}
			swap(enBuyukIndex, i);
			
		}
	}
	
	public void bubbleSort()
	{
		boolean swapped = true;
		while(swapped)
		{
			swapped= false;
			for(int i = 1;i < elemanSayisi ;i++)
			{
				if (liste[i-1]>liste[i])
				{
					swap(i-1,i);
					swapped = true;
				}
			}
			
		}
	}
}
