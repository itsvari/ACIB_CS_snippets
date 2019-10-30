import java.io.*;

public class addSubFunc {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;

		System.out.println("Enter the first number.");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number.");
		b = Integer.parseInt(br.readLine());

		System.out.println("[1] Add or [2] subtract?");

		int choice = Integer.parseInt(br.readLine());

		if (choice == 1) {
			addFunc(a, b);
		} else if (choice == 2) {
			subFunc(a, b);
		} else {
			System.out.println("That isn't a valid option.");
		}
	}

	public static void addFunc(int a, int b) {
		int c;
		c = a + b;
		System.out.println("The result of the addition is " + c);
	}

	public static void subFunc(int a, int b) {
		int d;
		d = a - b;
		System.out.println("The result of the subtraction is " + d);
	}
}
