import java.io.*;

public class BinarySearch {
	public static void main(String[] args) throws IOException {
		int num, item, first, last, middle;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Create array with user-defined size.
		System.out.println("How large do you want your array to be?");
		num = Integer.parseInt(br.readLine());
		int array[] = new int[num];

		// Populate the array.
		System.out.println("Enter " + num + " integers.");
		for (int i = 0; i < num; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		// Ask for search value
		System.out.println("Enter the search value.");
		item = Integer.parseInt(br.readLine());

		// Initialise search values
		first = 0;
		last = (num - 1);
		middle = (first + last)/2;

		while (first <= last) {
			if (array[middle] < item) {
				first = middle + 1;
			} else if (array[middle] == item) {
				System.out.println(item + " found at location " + (middle + 1) + ".");
				break;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}

		if (first > last) {
			System.out.println(item + " was not found.");
		}
	}
}
