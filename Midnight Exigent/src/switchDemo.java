import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Get 2 numbers
		System.out.println("Enter the first number.");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number.");
		int y = Integer.parseInt(br.readLine());

		// Get choice
		System.out.println("[1] Add, [2] Subtract, [3] Multiply?");
		int choice = Integer.parseInt(br.readLine());
		int result;

		switch (choice) {
			case 1: {
				result = add(x,y);
				System.out.println("The result of " + x + " + " + y + " is " + result + ".");
				break;
			}
			case 2: {
				result = subtract(x,y);
				System.out.println("The result of " + x + " - " + y + " is " + result + ".");
				break;
			}
			case 3: {
				result = multiply(x,y);
				System.out.println("The result of " + x + " * " + y + " is " + result + ".");
				break;
			}
			default: {
				System.out.println("That isn't an option.");
			}
		}
	}

	private static int add(int x, int y) {
		return x + y;
	}

	private static int subtract(int x, int y) {
		return x - y;
	}

	private static int multiply(int x, int y) {
		return x * y;
	}
}
