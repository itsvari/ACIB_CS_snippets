import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class stackToArray {
	private static int counter = 0;
	private static int arrayCounter=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] stack = new int[6];
		int[] otherArray = new int[6];
		boolean stop = false;

		while (!stop) {
			System.out.println("[1] Push");
			System.out.println("[2] Pop");
			System.out.println("[3] Print discard array");
			System.out.println("[4] End");
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
					intoArray(otherArray, pop(stack));
					stop = false;
					break;
				case 3:
					System.out.println("Printing discard array");
					System.out.println(printArray(otherArray));
					stop = false;
					break;
				case 4:
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

	private static int pop(int[] arr) {
		int retVal = 0;
		if (counter <= 0) {
			System.out.println("Error: Stack underflow. Number not popped.");
			return retVal;
		} else {
			System.out.println("Popping " + arr[(counter - 1)]);
			retVal = arr[(counter - 1)];
			arr[(counter - 1)] = 0;
			counter--;
			return retVal;
		}
	}

	private static void intoArray(int[] arr, int input) {
		if (arrayCounter>=6) {
			System.out.println("Discard array full. Discarding value " + arr[0]);
			for (int i=0; i <= arr.length; i++) {
				arr[i] = arr[i-1];
			}
			arr[(arrayCounter)] = input;
		} else {
			arr[arrayCounter] = input;
			arrayCounter++;
		}
	}

	private static String printArray(int[] arr) {
		return Arrays.toString(arr);
	}
}