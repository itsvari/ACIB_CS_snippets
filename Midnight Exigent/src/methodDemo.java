public class methodDemo {
	public static int getMin (int n1, int n2) {
		int min;

		if (n1 > n2) {
			min = n2;
		} else {
			min = n1;
		}

		return min;
	}

	public static int getMax (int n1, int n2) {
		int max;

		if (n1 < n2) {
			max = n2;
		} else {
			max = n1;
		}

		return max;
	}
}
