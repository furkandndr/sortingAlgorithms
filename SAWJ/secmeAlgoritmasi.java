package VeriYap�lari;

import java.util.Random;
import java.util.Scanner;

public class secmeAlgoritmasi {

	private static int elemansayisi;
	private static int dizi[];
	private static Random r;

	public static void main(String[] args) {

		diziolustur();
		diziGoruntule(dizi);// s�ras�z halde
		secmeSiralama(dizi);
		System.out.println(" ");
		diziGoruntule(dizi);// s�ralanm�� dizi g�steriliyor

	}

	private static void secmeSiralama(int rakamDizi[]) {

		for (int i = 0; i < rakamDizi.length; i++) {
			System.out.println("\niterasyon :"+(i+1));
			for (int j = i + 1; j < rakamDizi.length; j++) {
				if (rakamDizi[j] < rakamDizi[i]) {
					int b = rakamDizi[i];
					rakamDizi[i] = rakamDizi[j];
					rakamDizi[j] = b;
				}
			}
			diziGoruntule(dizi);
			

		}

	}

	// dizi olu�turma metodu
	private static void diziolustur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("dizi eleman say�s�:");
		elemansayisi = sc.nextInt();

		dizi = new int[elemansayisi];// 8
		r = new Random();
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = r.nextInt(100);
		}

	}// dizi g�r�nt�leniyor

	private static void diziGoruntule(int sayidizisi[]) {

		for (int i = 0; i < sayidizisi.length; i++) {
			System.out.print(sayidizisi[i] + " ");
		}
	}
}
