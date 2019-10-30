import java.io.*;

public class ddArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Enter the number for row " + i + ", position " + j + ".");
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("The number in row " + i + ", position " + j + " is " + arr[i][j]);
			}
		}
	}
}