import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cointoss {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] cointoss = new boolean[10];

		System.out.println("Enter 0 for tails and 1 for heads.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Result of toss " + (i+1) + "?");
			if (Integer.parseInt(br.readLine()) == 1) {
				cointoss[i] = true;
			} else {
				cointoss[i] = false;
			}
		}

		if (searchHeads(cointoss)) {
			System.out.println("Tails was not tossed.");
		} else {
			System.out.println("Tails was tossed.");
		}
	}

	public static boolean searchHeads (boolean arr[]) {
		int c = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]) c++;
			else c = 0;

			if (c==10) return true;
		}

		return false;
	}
}
