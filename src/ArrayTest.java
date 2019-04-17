import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		int broj, najveciElement, najmanjiElement;
		double aritmetickaSredina, suma = 0;

		System.out.print("Koliko zelite unjeti elementa niza: ");
		broj = unos.nextInt();

		int[] niz = new int[broj];
		int[] nizUnikatnihElemenata = new int[broj];

		System.out.println("Unesite elemente niza");

		for (int i = 0; i < broj; i++) {
			niz[i] = unos.nextInt();
		}

		// pronalazak sume elemenata niza
		for (int i = 0; i < broj; i++) {
			suma += niz[i];
		}

		// racunanje aritmeticke sredine niza
		aritmetickaSredina = suma / broj;

		// trazenje najveceg elementa niza
		najveciElement = niz[0];

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > najveciElement) {
				najveciElement = niz[i];
			}
		}

		// trazenje najmanjeg elementa niza
		najmanjiElement = niz[0];

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < najmanjiElement) {
				najmanjiElement = niz[i];
			}
		}

		// sortiranje niza
		Arrays.sort(niz);

		// trazenje unikatnih elemenata

		int brojac = 0;

		for (int i = 0; i < niz.length; i++) {

			boolean uniqElement = true;

			for (int j = 0; j < niz.length; j++) {
				if (niz[i] == niz[j] && i != j) {
					uniqElement = false;
					break;
				} else {
					uniqElement = true;
				}
			}
			if (uniqElement) {
				nizUnikatnihElemenata[brojac] = niz[i];
				brojac++;
			}
		}

		// ispis
		System.out.println("\nNajmanji broj u nizu: " + najmanjiElement);
		System.out.println("Najveći broj u nizu: " + najveciElement);
		System.out.println("Suma svih brojeva u nizu: " + suma);
		System.out.println("Prosjek svih brojeva u nizu: " + aritmetickaSredina);
		if (brojac == 0) {
			System.out.println("Nema unikatnih brojeva.");
		} else {
			System.out.println("Unikatni brojevi u nizu: ");
			for (int i = 0; i < brojac; i++) {
				System.out.print(nizUnikatnihElemenata[i] + " ");
			}
			System.out.println();
		}
		System.out.println("Sortiran niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		unos.close();
	}

}
