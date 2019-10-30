import java.io.*;
import java.util.Arrays;

public class ddtosd {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How large do you want your arrays to be?");
		int size = Integer.parseInt(br.readLine());

		// Initialise arrays
		int dd[][] = new int[size][size];
		int sd[] = new int[size];

		// Populating double dimension array
		System.out.println("Populate the array.");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.println("Enter the number in array " + i + " position " + j);
				dd[i][j] = Integer.parseInt(br.readLine());
			}
		}

		// Print out contents of double dimension array
		System.out.println("The double dimension array contains: ");
		System.out.println(Arrays.deepToString(dd));

		for (int i=0; i<size; i++) {
			sd[i] = dd[i][i];
		}

		// Print out contents of single dimension array
		System.out.println("The single dimension array contains: ");
		System.out.println(Arrays.toString(sd));
	}
}