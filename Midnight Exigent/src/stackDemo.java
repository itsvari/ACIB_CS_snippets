import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stackDemo {
	private static int counter = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] stack = new int[5];
		boolean stop = false;

		while (!stop) {
			System.out.println("[1] Push");
			System.out.println("[2] Pop");
			System.out.println("[3] Print stack");
			System.out.println("[4] Peek");
			System.out.println("[5] End");
			switch (Integer.parseInt(br.readLine())) {
				case 1:
					System.out.println("Push selected.");
					System.out.println("What number do you want to push?");
					int pushedNumber = Integer.parseInt(br.readLine());
					push(stack, pushedNumber);
					stop = false;
					break;
				case 2:
					System.out.println("Pop selected.");
					pop(stack);
					stop = false;
					break;
				case 3:
					System.out.println("Printing stack.");
					print(stack);
					stop = false;
					break;
				case 4:
					System.out.println("Peeking.");
					peek(stack);
					stop = false;
					break;
				case 5:
					System.out.println("Stopping.");
					stop = true;
					break;
				default:
					System.out.println("That is not a valid option.");
					stop = false;
			}
		}
	}

	private static void push(int[] arr, int item) {
		if (counter>=arr.length) {
			System.out.println("Error: Stack overflow. Number not pushed.");
		} else {
			arr[counter] = item;
			counter++;
			System.out.println(item + " pushed.");
		}
	}

	private static void pop(int[] arr) {
		if (counter<=0) {
			System.out.println("Error: Stack underflow. Number not popped.");
		} else {
			System.out.println("Popping " + arr[(counter-1)]);
			arr[(counter-1)] = 0;
			counter--;
			if (counter==0) {
				System.out.println("The stack is now empty.");
			} else {
				System.out.println("Number at top is now " + arr[(counter-1)]);
			}
		}
	}

	private static void print(int[] arr) {
		if (counter==0) {
			System.out.println("The stack is empty; there is nothing to print.");
		} else {
			for (int i = (counter-1); i > -1; i--) {
				if (i == (counter-1)) {
					System.out.println(arr[i] + " <- top");
				} else {
					System.out.println(arr[i]);
				}
			}
		}
	}

	private static void peek(int[] arr) {
		if (counter==0) {
			System.out.println("The stack is empty; there is nothing to peek.");
		} else {
			System.out.println("Element at top is " + arr[(counter-1)]);
		}
	}
}
