import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parityCheck {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] number = new int[8];
		boolean counter = false;

		// get input
		System.out.println("Enter the bits.");
		for (int i=0; i<8; i++) {
			System.out.println("Enter bit " + i);
			number[i] = Integer.parseInt(br.readLine());
		}

		// check for parity: even = false, odd = true
		for (int i=0; i<8; i++) {
			if (number[i] == 1) counter = !counter;
		}

		if (counter) System.out.println("The number of 1s is odd.");
		else System.out.println("The number of 1s is even.");
	}
}