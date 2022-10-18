package ders18;


public class Ders18 {

	public static void main(String[] args) {

		 
		PazarListesi liste = new PazarListesi(5);
		
		liste.listeyeEkle("Ekmek");
		liste.listeyeEkle("Bal");
		liste.listeyeEkle("Süt");
		liste.listeyeEkle("Reçel");
		liste.listeyeEkle("Yumurta");

		liste.yaz();
		

		liste.sil(0);

		liste.yaz();

		liste.ekle("Eklenen", 4); // 5. satıra eklendi.
		
		liste.yaz();

		
		
		
						
	}

}
