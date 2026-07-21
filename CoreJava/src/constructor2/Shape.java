package constructor2;

public class Shape {
	public String color;
	public int borderWidth;

	public Shape() {
		System.out.println("This is default constructor shape");
	}

	public Shape(String color) {
		this();
		this.color = color;
		System.out.println(this.color);
	}

	public Shape(int borderWidth, String color) {
		this(color);
		this.borderWidth = borderWidth;
		System.out.println(this.borderWidth);
	}
}
