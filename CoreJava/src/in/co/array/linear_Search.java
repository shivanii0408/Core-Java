package in.co.array;

public class linear_Search {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int num = 40;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
				System.out.println(+i);
			}

		}
	}
}
