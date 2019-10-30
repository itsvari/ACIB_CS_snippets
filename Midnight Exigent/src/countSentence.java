import java.io.*;

public class countSentence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		String s1;

		System.out.println("Please enter a sentence.");
		s1 = br.readLine();

		for (int i=0; i<s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				count = count+1;
			}
		}

		System.out.println("The sentence is " + count + " words long.");
	}
}
