package Inheritance;

public class Test_Shape {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.setRadius(4);
		c.setColor("pink");
		c.setBorderWidth(3);

		System.out.println("Radius: " + c.getRadius());
		System.out.println("Color: " + c.getColor());
		System.out.println("BorderWidth: " + c.getBorderWidth());
		c.area();
	}
}