import java.io.*;

public class countVowels {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countVowels = 0;
		int countConsonants = 0;
		int countChars = 0;
		int countNonAlphabet = 0;
		String s1;
		String s2;

		System.out.println("Please enter a sentence.");
		s1 = br.readLine();
		s2 = s1;

		s1 = s1.toUpperCase();

		for (int i=0; i<s1.length(); i++) {
			if (s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U') {
				countVowels = countVowels + 1;
			} else if (s1.charAt(i) == 'B' || s1.charAt(i) == 'C' || s1.charAt(i) == 'D' || s1.charAt(i) == 'F' || s1.charAt(i) == 'G' || s1.charAt(i) == 'H' || s1.charAt(i) == 'J' || s1.charAt(i) == 'K' || s1.charAt(i) == 'L' || s1.charAt(i) == 'M' || s1.charAt(i) == 'N' || s1.charAt(i) == 'P' || s1.charAt(i) == 'Q' || s1.charAt(i) == 'R' || s1.charAt(i) == 'S' || s1.charAt(i) == 'T' || s1.charAt(i) == 'V' || s1.charAt(i) == 'W' || s1.charAt(i) == 'X' || s1.charAt(i) == 'Y' || s1.charAt(i) == 'Z'){
				countConsonants = countConsonants + 1;
			} else {
				countNonAlphabet = countNonAlphabet + 1;
			}
			countChars = countChars + 1;
		}

		System.out.println("The sentence you entered is: " + s2);
		System.out.println("It contains " + countVowels + " vowels, " + countConsonants + " consonants and " + countNonAlphabet + " non-alphabetic characters.");
		System.out.println("In total, it has " + countChars + " characters.");
	}
}