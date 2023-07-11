package designpattern.adapter.thirdparty;

public class Rhombus implements GShape {

	// sides
	private final double a;
	private final double b;

	public Rhombus() {
		this(1.0d, 1.0d);
	}

	public Rhombus(double d, double e) {
		this.a = d;
		this.b = e;

	}

	public double area() {

		double s = a * b;
		return s;
	}

	public double perimeter() {

		return 2 * (a + b);
	}

	public void drawShape() {
		System.out.println("Drawing Rhombus with area: " + area() + " and perimerter: " + perimeter());
	}

}
