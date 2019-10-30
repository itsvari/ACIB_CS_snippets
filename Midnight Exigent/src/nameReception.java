import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nameReception {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the first name.");
		String first = br.readLine();
		System.out.println("Enter the surname.");
		String sur = br.readLine();

		System.out.println("The name is " + concatenateName(first, sur));
	}

	private static String concatenateName(String f, String l) {
		return f + " " + l;
	}
}