package Polymorphism;

public class Test_Shape {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		System.out.println("Length " + s.length);

		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setWidth(10);

		double totalArea = calcArea(s);
	}

	private static double calcArea(Shape[] s) {
		double totalArea = 0.0;
		for (int i = 0; i < s.length; i++) {
			System.out.println("area: " + s[i].area());
			totalArea = totalArea + s[i].area();
		}
		return totalArea;
	}
}
