import java.io.*;

public class stringCheck {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please enter the sentence.");
		String send = br.readLine();
		System.out.println("The sentence is " + count(send) + " words long." );
	}

	public static int count(String input) {
		int counter = 1;

		for (int i=0; i<input.length(); i++) {
			if (input.charAt(i) == ' ') {
				counter = counter+1;
			}
		}

		return counter;
	}
}
