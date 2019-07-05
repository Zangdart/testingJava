package testingJava;

import java.util.ArrayList;
//import java.util.Arrays;

public class Invoice {
	private double discount = 0.2 ;
	
	ArrayList<Item> item = new ArrayList<Item>();
	
	
	public void add(Item anItem) {
		item.add(anItem);
	}
	
	
	public double getDiscount() {
		int res = 0;
		for(int i = 0; i < item.size();i++) {
			Item monItem = item.get(i);
			monItem.getIsPet();
			res += monItem.getQuantity();
		}
		
		
		
		return discount;
	}
	
	 @Override
	    public String toString() { 
	        return "item " + item; 
	    } 	
	
}
