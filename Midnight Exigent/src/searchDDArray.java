import java.io.*;

public class searchDDArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter the number for row " + i + ", position " + j + ".");
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		int sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					sum = sum + arr[i][j];
				}
			}
		}

		System.out.println("What number do you want to search for?");
		int search;
		search = Integer.parseInt(br.readLine());
		boolean flag = false;
		int searchRow = 0;
		int searchColumn = 0;

		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j] == search) {
					flag = true;
					searchRow = i;
					searchColumn = j;
				}
			}
		}
		if (flag) {
			System.out.println("The number that you searched for was found in row " + searchRow + ", position " + searchColumn + ".");
		} else {
			System.out.println("The number that you searched for was not found.");
		}
	}
}
