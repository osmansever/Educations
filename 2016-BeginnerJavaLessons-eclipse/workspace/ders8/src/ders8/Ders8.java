package ders8;

public class Ders8 {
	public static void main(String[] args) {
		
		Insan i1 = new Insan();
		Insan i2 = new Insan();
		Insan i3 = new Insan("Osman",21);
		Insan i4 = new Insan("Buse",18);
		
		i3.selamla();
		i4.biriniselamla(i3.getIsim());
		
		
		i3.biriniselamlav2(i4); // Burada parantez içine bir insan objesi girilmeli string değer girilemez.
		
		System.out.println("Hadi gel oyun oynayalım :):):):)"  + i3.getIsim());

	}
	

}
