package ders11;

import java.util.Scanner;

public class Ders11 {

	public static void main(String[] args) {

		int x = 0;
		
				
		
		while ( x != 4)
		{
		
			
		System.out.println("1.Ara");
		System.out.println("2.Kaydet");
		System.out.println("3.Y�kle");
		System.out.println("4.��k");
		System.out.print("Se�enek Gir: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		

		if (x == 1)
		{
			System.out.println("Arand�");
		}
		else if (x == 2){
			System.out.println("Kaydedildi");
		}
		else if(x ==3) {
			System.out.println("Y�klendi");
		}
		else if (x != 4) {
			System.out.println("Hatal� giri� yap�ld�.");
		}
		}
		
		

	}

}
