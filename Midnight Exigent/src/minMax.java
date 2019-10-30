import java.io.*;

public class minMax {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int min = 2147483647;
		int[] arr = new int[6];

		for (int i=0; i<6; i++) {
			System.out.println("Please enter a number.");
			arr[i] = Integer.parseInt(br.readLine());

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Max is " + max);
		System.out.println("Min is " + min);
	}
}