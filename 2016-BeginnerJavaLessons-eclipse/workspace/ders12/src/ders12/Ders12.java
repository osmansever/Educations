package ders12;

import java.util.Scanner;

public class Ders12 {

	public static void main(String[] args) {

		int x = 30;
		int cevap = 0;
		boolean oyunDevam = true;
		
		while (oyunDevam)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Tahmin et bakalým:" );
			cevap = sc.nextInt();
			
			if (cevap < x)
			{
				System.out.println("Tahminini büyüt!");
			}
			else if (cevap > x)
			{
				System.out.println("Tahminini küçült!");
			}
			else if (cevap == x)
			{
				System.out.println("Doðru bildin!");
				oyunDevam = false;
				
			}
		}
				
	}

}
