package ders6;

public class Insan {

	String isim;
     int yas ;
	
     //Constructor e�er olu�turulmam��sa java bo� bir tane oldu�unu varsayar ve varsay�lan de�erler verir.
     // String i�in null int i�in 0 gibi
     public Insan()
     {
    	isim = "isimsiz";
    	yas =  -1;
    	
     }
     
     public Insan(String alisim,int alyas)
     {
    	 yas = alyas;
    	 isim = alisim;
    	 
     }
}
