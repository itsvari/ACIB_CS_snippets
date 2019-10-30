import java.io.*;
import java.util.Arrays;

public class selectionSort {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Get number of items in array
		System.out.println("How many items to sort?");
		int arrayLength = Integer.parseInt(br.readLine());

		// Create array
		int[] array = new int[arrayLength];

		// Populate array
		for (int i=0; i<arrayLength; i++) {
			System.out.println("Enter the number in position " + i);
			array[i] = Integer.parseInt(br.readLine());
		}

		// Selection sort
		for (int i=0; i<(arrayLength-1); i++) {
			int jMin = i;

			for (int j=(i+1); j<arrayLength; j++) {
				if (array[j] < array[jMin]) jMin = j;
			}

			if (jMin != i) {
				int temp = array[jMin];
				array[jMin] = array[i];
				array[i] = temp;
			}
		}

		// Show sorted array
		System.out.println("Array sorted.");
		System.out.println(Arrays.toString(array));
	}
}