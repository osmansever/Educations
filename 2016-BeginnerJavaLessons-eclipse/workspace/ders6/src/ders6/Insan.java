package ders6;

public class Insan {

	String isim;
     int yas ;
	
     //Constructor eğer oluşturulmamışsa java boş bir tane olduğunu varsayar ve varsayılan değerler verir.
     // String için null int için 0 gibi
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
