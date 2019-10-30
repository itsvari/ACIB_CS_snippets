import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursiveMP {
	private static long largestPersist = 0;
	private static long persistedNumber = 0;

	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.print("Highest multiplicative persistance is " + largestPersist);
				System.out.println(", and the smallest number with that persistance is " + persistedNumber);
			}
		});
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What number do you want to begin at? Min value: 0");
		long startNo = Long.parseLong(br.readLine());
		System.out.println("What number do you want to stop at? Max value: 9223372036854775807");
		long stopNo = Long.parseLong(br.readLine());

		for (long i = startNo; i <= stopNo; i++) {
			System.out.println("Trying " + i);
			boolean flag = false;
			boolean has0 = false;
			long counter = 0;
			long holder = 0;

			String check0 = Long.toString(i);
			for (int j = 0; j < check0.length(); j++) {
				if (check0.charAt(j) == '0') {
					has0 = true;
				} else {
					has0 = false;
				}
			}

			if (has0) {
				System.out.println("0");
				System.out.println("Total steps: 1");
			} else {
				while (!flag) {
					if (counter == 0) {
						holder = multiplicativePersist.checkPersist(i);
					} else {
						holder = multiplicativePersist.checkPersist(holder);
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

				if (counter>largestPersist) {
					largestPersist = counter;
					persistedNumber = i;
				}
			}
		}
	}
}