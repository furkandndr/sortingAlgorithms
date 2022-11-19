package VeriYap�lari;
import java.util.Random;
import java.util.Scanner;

public class Kabarc�kBubleSort_uygulamas� {
	private static int eleman_sayisi;
	private static int dizi[];
	private static Random r;

	public static void main(String[] args) {

		dizi_olustur();// dizi olu�turuldu
		dizi_Goruntule(dizi);// s�ras�z g�r�nt�lendi
		kabarc�k_S�ralama(dizi);
		

	}

	// kabarc�k s�ralama algoritmas� 
	private static void kabarc�k_S�ralama(int rakam_dizisi[]) {
		
		for (int i = 0; i < rakam_dizisi.length; i++) {

			System.out.println("\n�terasyon:" + (i+1));

			for (int j = 0; j < rakam_dizisi.length - 1-i; j++) {

				if (rakam_dizisi[j + 1] < rakam_dizisi[j]) {
					int b = rakam_dizisi[j];
					rakam_dizisi[j] = rakam_dizisi[j + 1];
					rakam_dizisi[j + 1] = b;
				}

			}

			dizi_Goruntule(dizi);
			System.out.println(" ");
		}
	
	
	
	
	
		
	}

	private static void dizi_olustur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("dizi eleman say�s�:");
		eleman_sayisi = sc.nextInt();

		dizi = new int[eleman_sayisi];// 4
		r = new Random();
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = r.nextInt(100);
		}

	}

	private static void dizi_Goruntule(int sayi_dizisi[]) {
		

		for (int i = 0; i < sayi_dizisi.length; i++) {
			System.out.print(sayi_dizisi[i] + " ");
		}
	}
}
