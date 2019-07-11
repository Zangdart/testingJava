package testingJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	ArrayList<Item> item = new ArrayList<Item>();

	public void add(Item anItem) {
		item.add(anItem);
	}

	public double getDiscount() {
		boolean isPet = false;
		double petPrice = 0;
		double otherPrice = 0;
		int totalQuantity = 0;

		// enhanced for loop
		for (Item e : item) {
			if (e.getIsPet()== true) { //c'est la le pb
				isPet = true;
				petPrice = e.getPrice() * e.getQuantity();
			} else {
				otherPrice = e.getPrice() * e.getQuantity();
				totalQuantity += e.getQuantity();
			}
		} // for

		if (isPet == true && totalQuantity >= 5) {
			return petPrice + otherPrice * 0.8;
		} else {
			return petPrice + otherPrice;
		}

	}// getDiscount()

	@Override
	public String toString() {
		return "item " + item;
	}

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		Scanner sc = new Scanner(System.in);
		boolean done = false;

		while (!done) {
			double prix;
			int quantite;
			boolean isPet = false;

			System.out.println("Quel est le prix de l'item que vous voulez ajouter ?");
			prix = sc.nextDouble();
			System.out.println("Quel est la quantite de l'item que vous voulez ajouter ?");
			quantite = sc.nextInt();
			System.out.println("Est ce un animal ? 0-oui 1-non ");
			isPet = sc.nextInt() == 0;
			System.out.println("Avez-vous d'autre articles ? 0-oui 1-non");
			done = sc.nextInt() == 1;

			// ajoute l'item
			invoice.add(new Item(prix, isPet, quantite));

		} // while

		System.out.println("Le total de votre facture est de  " + invoice.getDiscount());

	}// main

}
