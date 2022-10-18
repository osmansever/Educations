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
		
		System.out.println("Ýsim: " + i1.getIsim() + " Yaþ: " + i1.getYas() );
		System.out.println("Ýsim: " + i2.getIsim() + " Yaþ: " + i2.getYas() );
		System.out.println("Ýsim: " + i3.getIsim() + " Yaþ: " + i3.getYas() );
		System.out.println("Ýsim: " + i4.getIsim() + " Yaþ: " + i4.getYas() );
		
		
		
	}
}
