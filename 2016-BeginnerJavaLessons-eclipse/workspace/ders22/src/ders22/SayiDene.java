package ders22;

public class SayiDene {

	public static void main(String[] args) {

		SatiListesi liste = new SatiListesi(8);
		
		liste.ekle(5, 0);
		liste.ekle(2, 0);
		liste.ekle(1, 0);
		liste.ekle(4, 0);
		liste.ekle(6, 0);
		liste.ekle(22, 0);
		liste.ekle(8, 0);
		liste.ekle(9, 0);


		liste.yaz();
		
		System.out.println();
		liste.selectionSort();
		
		liste.yaz();
		System.out.println();
		
		liste.selectionSortTers();
		
		liste.yaz();
		
		
	}

}
