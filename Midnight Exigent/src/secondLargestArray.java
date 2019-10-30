import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class secondLargestArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Prompt for amount of integers to be sorted
		System.out.println("How many numbers do you want to sort?");
		int amt = Integer.parseInt(br.readLine());

		// Initialize array + prompt for entry
		int[] ar = new int[amt];
		System.out.println("Enter " + amt + " numbers.");

		// Record entry
		for (int i=0; i<amt; i++) {
			System.out.println("Position " + (i+1));
			ar[i] = Integer.parseInt(br.readLine());
		}

		// Sort array from highest to lowest
		for (int i=0; i<amt; i++) {
			for (int j=1; j<amt; j++) {
				if (ar[j-1] < ar[j]) {
					int temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(ar));
		System.out.println(ar[1]);
	}
}