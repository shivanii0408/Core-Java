package Overriding;

public class Test_Shape2 {

	public static void main(String[] args) {
		Shape c1 = new Circle();
		Circle c = (Circle) c1;
		c.setColor("Blue");
		c.setBorderWidth(4);
		c.setRadius(2);

		System.out.println("color: " + c.getColor());
		System.out.println("borderwidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();

	}

}