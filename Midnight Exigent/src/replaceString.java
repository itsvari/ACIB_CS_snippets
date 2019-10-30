import java.io.*;

public class replaceString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;

		System.out.println("Please enter a string in uppercase.");
		name = br.readLine();
		name = name.toUpperCase();

		String s1 = name.replace('E', 'Z');
		System.out.println("The letter-swapped string reads " + s1);

		String s2 = s1.toLowerCase();
		System.out.println("The lowercase string reads " + s2);
	}
}
