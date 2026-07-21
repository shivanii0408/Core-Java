package Overriding;

import Inheritance.Circle;

public class Test_Shape {
	public static void main(String[] args) {

		Circle c = new Circle();

		c.setColor("red");
		c.setBorderWidth(2);
		c.setRadius(2);
		
          c.area();
		System.out.println("colour: " + c.getColor());
		System.out.println("borderwidth : " + c.getBorderWidth());
		System.out.println("circle radius: " + c.getRadius());
		

	}
}