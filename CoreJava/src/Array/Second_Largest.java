package Array;

public class Second_Largest {
	public static void main(String[] args) {
		int[] a = { 30, 40, 40, 10, 50 };
		int max = a[0];
		int secLargest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("max: " + max);

		for (int i = 0; i < a.length; i++) {
			if (a[i] < max && a[i] > secLargest) {
				secLargest = a[i];
			}
		}

		System.out.println("secLargest: " + secLargest);
	}
}
