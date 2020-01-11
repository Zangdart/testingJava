package arrayList2;

/** 
 * On va creer une classe Customer avec un constructeur contenant un nom et une quantite.
 * On aura egalement des accesseurs pour chaques champs. 
 * 
 * @author Davy Castanet 
 * */

public class Customer {
	String name;
	double amount;
	
	public Customer(String name, double amount) {
		this.name = name;
		this.amount = amount; 
	}

	public String getName() {
		return name;
	}
	
	public double getAmount() {
		return amount; 
	}
	
}
