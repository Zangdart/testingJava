package testingJava;

import java.util.ArrayList;

public class Invoice {
	private double discount = 0.2 ;
	
	ArrayList<Item> item = new ArrayList<Item>();
	
	
	public void add(Item anItem) {
		item.add(anItem);
	}
	
	
	public double getDiscount() {
		return discount;
	}
	
	 @Override
	    public String toString() { 
	        return "item " + item; 
	    } 	
	
}
