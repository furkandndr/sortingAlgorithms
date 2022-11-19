package VeriYapýlari;

import java.util.Random;
import java.util.Scanner;

public class YerleþtirmeliSýralama {

	private static int elemansayisi;
	private static int dizi[];
	private static Random r;

	public static void main(String[] args) {

		diziolustur();
		diziGoruntule(dizi);// sýrasýz halde
		yerlestirmeliSýralama(dizi);
		System.out.println("\n");
		diziGoruntule(dizi);

	}

	private static void yerlestirmeliSýralama(int rakam[]) {

		for (int i = 1; i < rakam.length; i++) {
			System.out.println("\niterasyon:"+i);
			int tasýnan = rakam[i];
			int j = i;
			while (j > 0  && tasýnan < rakam[j-1]  ) {

				rakam[j] = rakam[j - 1];
				j--;

				
			}
			
			rakam[j] = tasýnan;
			diziGoruntule(dizi);
		}

	}

	private static void diziolustur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("dizi eleman sayýsý:");
		elemansayisi = sc.nextInt();

		dizi = new int[elemansayisi];// 8
		r = new Random();
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = r.nextInt(100);
		}

	}

	private static void diziGoruntule(int sayidizisi[]) {

		for (int i = 0; i < sayidizisi.length; i++) {
			System.out.print(sayidizisi[i] + " ");
		}
	}
}
