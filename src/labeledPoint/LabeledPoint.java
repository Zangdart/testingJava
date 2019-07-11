package labeledPoint;

import java.awt.Point;

public class LabeledPoint extends Point {

	String label;

	LabeledPoint(int x, int y, String label) {
		super(x, y);
		this.label = label;
	}

	@Override
	public String toString() {
		return "position en x : " + x + " position en y : " + y + " label : " + label;
		// super.toString()
	}

	public static void main(String[] args) {
		LabeledPoint p = new LabeledPoint(5, 8, "Etiquette");
		System.out.println(p);

	}

}
