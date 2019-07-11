package Rectangle;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

	public double getArea() {
		return getHeight() * getWidth();
	}

	public double getPerimeter() {
		return 2 * getHeight() + 2 * getWidth();
	}
	
	 public static void main(String[] args) {
	        BetterRectangle r = new BetterRectangle();

	        r.setSize(4, 10);

	        System.out.println("Area " + r.getArea());
	        System.out.println("Perimeter " + r.getPerimeter());
	    }
	
	
}
