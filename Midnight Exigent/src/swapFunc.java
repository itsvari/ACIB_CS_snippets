import java.io.*;

public class swapFunc {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;

		System.out.println("Enter the first value.");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter the second value.");
		b = Integer.parseInt(br.readLine());

		System.out.print("Before swapping values, the first value is: " + a);
		System.out.println(" and the second value is: " + b);

		swapIt(a, b);
	}

	public static void swapIt(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.print("After swapping values, the first value is: " + a);
		System.out.println(" and the second value is: " + b);
	}
}
