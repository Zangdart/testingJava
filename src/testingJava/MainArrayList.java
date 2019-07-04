package testingJava;


public class MainArrayList {

	public static void main(String[] args) {
		
		Item doggo = new Item(100,true,1); 
		Invoice invoice = new Invoice();
		invoice.add(doggo);
		System.out.println(invoice);
		
	}

}
