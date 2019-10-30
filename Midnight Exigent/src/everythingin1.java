import java.io.*;

public class everythingin1 {
	public static void main(String[] args) throws IOException {
		while (true) {
			int x, y;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("What do you want to do?");
			System.out.println("[1] Positive or Negative check");
			System.out.println("[2] Even or Odd check");
			System.out.println("[3] Leap Year check");
			System.out.println("[4] 1D array summer test");
			System.out.println("[5] Parallel array test");
			System.out.println("[6] Min and Max");
			System.out.println("[7] Replace in string");
			System.out.println("[8] Sentence word count");
			System.out.println("[9] Character count");
			System.out.println("[10] Double dimension arrays");
			x = Integer.parseInt(br.readLine());

			if (x == 1) {
				System.out.println("Positive or Negative check selected.");
				posNeg run = new posNeg();

				System.out.println("Please enter the number that you want to check.");
				y = Integer.parseInt(br.readLine());

				run.numCheck(y);

				System.out.println(run);
				break;
			} else if (x == 2) {
				System.out.println("Even or Odd check selected.");
				System.out.println("Please enter the number that you want to check.");

				y = Integer.parseInt(br.readLine());

				if (y % 2 == 0) {
					System.out.println("The number is even. But we aren't.");
					break;
				} else {
					System.out.println("The number is odd. Just like you.");
					break;
				}
			} else if (x == 3) {
				System.out.println("Leap Year check selected.");
				System.out.println("Please enter the year that you want to check.");

				y = Integer.parseInt(br.readLine());

				if (y % 4 == 0) {
					System.out.println("It's a leap year. Unless it's divisible by 100. Then it isn't. Unless it's divisible by 400. Then it is.");
					System.out.print("This system's just dumb.");
					break;
				} else {
					System.out.println("No, it's not a leap year. Idiot.");
					break;
				}
			} else if (x == 4) {
				System.out.println("1D array summer selected.");
				System.out.println("How large do you want the array to be?");

				y = Integer.parseInt(br.readLine());
				int sum = 0;
				int[] Ar = new int[y];

				for (int i = 0; i < y; i++) {
					System.out.println("Please enter the number at index " + i + ".");
					Ar[i] = Integer.parseInt(br.readLine());
				}

				for (int j = 0; j < y; j++) {
					System.out.println("Item at index " + j + ": " + Ar[j]);
				}

				for (int i : Ar) {
					sum +=i;
				}

				System.out.println("The sum of the numbers in the array is " + sum);

				break;
			} else if (x == 5) {
				System.out.println("Parallel array testing selected.");

				int count = 0;
				Boolean flag = false;
				int size;

				System.out.println("How many people do you want to have in this database?");
				size = Integer.parseInt(br.readLine());

				int[] id = new int[size];
				String[] name = new String[size];

				for (int i=0; i<size; i++) {
					System.out.println("Please enter a name.");
					name[i] = br.readLine();
					System.out.println("Please enter an ID number.");
					id[i] = Integer.parseInt(br.readLine());
				}

				System.out.println("Enter the ID number you want to search for.");
				x = Integer.parseInt(br.readLine());

				for (int i=0; i<size; i++) {
					if (id[i]==x) {
						flag = true;
						System.out.println("The name is " + name[i]);
					}
					count++;
				}

				if (!flag) {
					System.out.println("That person does not exist in our database.");
				}

				if (count<2) {
					System.out.println("There is 1 person in the database.");
				} else {
					System.out.println("There are " + count + " people in the database.");
				}

				break;
			} else if (x == 6) {
				System.out.println("Min and Max selected.");
				int max = 0;
				int min = 2147483647;
				int[] arr = new int[6];

				for (int i=0; i<6; i++) {
					System.out.println("Please enter a number.");
					arr[i] = Integer.parseInt(br.readLine());

					if (arr[i] > max) {
						max = arr[i];
					}

					if (arr[i] < min) {
						min = arr[i];
					}
				}

				System.out.println("Max is " + max);
				System.out.println("Min is " + min);

				break;
			} else if (x == 7) {
				System.out.println("Replace in string selected.");

				String name;

				System.out.println("Please enter a string in uppercase.");
				name = br.readLine();
				name = name.toUpperCase();

				String s1 = name.replace('E', 'Z');
				System.out.println("The letter-swapped string reads " + s1);

				String s2 = s1.toLowerCase();
				System.out.println("The lowercase string reads " + s2);

				break;
			} else if (x == 8) {
				System.out.println("Sentence word length selected.");

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

				break;
			} else if (x == 9) {
				System.out.println("Character count selected.");

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

				break;
			} else if (x == 10) {
				System.out.println("Double dimension arrays selected.");

				int rows;
				int columns;

				System.out.println("How many rows do you want the array to have?");
				rows = Integer.parseInt(br.readLine());
				System.out.println("How many columns do you want the array to have?");
				columns = Integer.parseInt(br.readLine());

				int arr[][] = new int[rows][columns];

				for (int i=0; i<rows; i++) {
					for (int j=0; j<columns; j++) {
						System.out.println("Enter the number for row " + i + ", position " + j + ".");
						arr[i][j] = Integer.parseInt(br.readLine());
					}
				}

				for (int i=0; i<rows; i++) {
					for (int j=0; j<columns; j++) {
						System.out.println("The number in row " + i + ", position " + j + " is " + arr[i][j]);
					}
				}

				break;
			} else {
				System.out.println("That isn't a valid option.");
				System.out.println("Dumbass.");
			}
		}
	}
}