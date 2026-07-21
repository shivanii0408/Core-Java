package in.co.encapsulation;

public class Test_Automobile {
	public static void main(String[] args) {
		Automobile a = new Automobile();
		a.setColor("Red");
		a.setSpeed(500);
		a.setMake("car");
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
		System.out.println(a.getMake());

		
		//a.accelerator();
		a.changeGear(1);
	}
}
