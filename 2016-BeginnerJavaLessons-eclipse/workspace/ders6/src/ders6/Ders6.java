package ders6;

public class Ders6 {

	public static void main(String[] args) {

		Insan i1 = new Insan();
		Insan i2 = new Insan();
		Insan i3 = new Insan("Osman",21);
		Insan i4 = new Insan("Buse",18);

		i1.isim = "Ali";
		//i1.yas = 18;
		
		//i2.isim = "Banu";
		i2.yas = 21;
		
		System.out.println("�sim: " + i1.isim + " Ya�: " + i1.yas );
		System.out.println("�sim: " + i2.isim + " Ya�: " + i2.yas );
		System.out.println("�sim: " + i3.isim + " Ya�: " + i3.yas );
		System.out.println("�sim: " + i4.isim + " Ya�: " + i4.yas );
		
		
		
	}


}
