package Constructor;

public class Sum {
	public Sum() {
		System.out.println("This is default constructor");
	}
	public Sum(int i,int j) {
		System.out.println(i+j);
	}
	public Sum(int i,int j,int k) {
		System.out.println((i+j+k)*2);
	}
}
