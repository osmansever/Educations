package ders11;

import java.util.Scanner;

public class Ders11 {

	public static void main(String[] args) {

		int x = 0;
		
				
		
		while ( x != 4)
		{
		
			
		System.out.println("1.Ara");
		System.out.println("2.Kaydet");
		System.out.println("3.Yükle");
		System.out.println("4.Çýk");
		System.out.print("Seçenek Gir: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		

		if (x == 1)
		{
			System.out.println("Arandý");
		}
		else if (x == 2){
			System.out.println("Kaydedildi");
		}
		else if(x ==3) {
			System.out.println("Yüklendi");
		}
		else if (x != 4) {
			System.out.println("Hatalý giriþ yapýldý.");
		}
		}
		
		

	}

}
