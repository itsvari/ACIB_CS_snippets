import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiplicativePersist {
	public static void main(String[] args) throws IOException {
		boolean flag = false;
		long counter = 0;
		long holder = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number.");
		long input = Long.parseLong(br.readLine());

		while (!flag) {
			if (counter == 0) {
				holder = checkPersist(input);
			} else {
				holder = checkPersist(holder);
			}

			if (holder <= 9) {
				counter++;
				System.out.println(holder);
				flag = true;
			} else {
				counter++;
				System.out.println(holder);
			}
		}

		System.out.println("Total steps: " + counter);
	}

	public static long checkPersist(long number) {
		String intermediate = Long.toString(number);
		long calculate = 0;

		for (int i = 0; i < intermediate.length(); i++) {
			if (i == 0) {
				calculate = Long.parseLong(Character.toString(intermediate.charAt(i)));
			} else {
				calculate = calculate * Long.parseLong(Character.toString(intermediate.charAt(i)));
			}
		}

		return calculate;
	}
}