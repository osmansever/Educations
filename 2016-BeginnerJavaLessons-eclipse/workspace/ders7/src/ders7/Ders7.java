package ders7;

public class Ders7 {

	
	public static void main(String[] args) {

		Insan i1 = new Insan();
		Insan i2 = new Insan();
		Insan i3 = new Insan("Osman",21);
		Insan i4 = new Insan("Buse",18);

		i1.setIsim("Ali");
		//i1.yas = 18;
		
		//i2.isim = "Banu";
		i2.setYas(21);
		
		System.out.println("�sim: " + i1.getIsim() + " Ya�: " + i1.getYas() );
		System.out.println("�sim: " + i2.getIsim() + " Ya�: " + i2.getYas() );
		System.out.println("�sim: " + i3.getIsim() + " Ya�: " + i3.getYas() );
		System.out.println("�sim: " + i4.getIsim() + " Ya�: " + i4.getYas() );
		
		
		
	}
}
