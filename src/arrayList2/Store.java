package arrayList2;

import java.util.ArrayList;

/** 
 * On va creer une classe Store qui aura une liste de Customer et aura des methodes pour ajouter  
 * des ventes et afficher le nom du Customer avec le plus de ventes.
 * 
 * @author Davy Castanet 
 * */

public class Store {
	// Store contient un ArrayList comme champs
	ArrayList<Customer> list = new ArrayList<Customer>();

	/**
	 * On va ajouter des clients a la list du ArrayList
	 * 
	 * @param customerName
	 * @param amount
	 */
	public void addSale(String customerName, double amount) {
		list.add(new Customer(customerName, amount));
	}

	/**
	 * On va retourner le nom du customer avec le plus gros amount
	 * 
	 * @return nameMax - le nom du customer avec le plus gros amount
	 */
	public String nameOfBestCustomer() {

		// variable pour avoir le plus gros amount des clients
		double amountMax = 0;

		String nameMax = "";

		for (Customer e : list) {
			if (e.amount > amountMax) {
				amountMax = e.amount;
				nameMax = e.name;
			}
		}
		return nameMax;
	}

	public static void main(String[] args) {

		Store store = new Store();

		store.addSale("Bob", 5);
		store.addSale("Jane", 69);
		store.addSale("Kaaris", 12);
		store.addSale("Lyonne", 120);
		store.addSale("Booba", 666);

		System.out.println(store.nameOfBestCustomer());

	}// main

}
