import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class giveDriversLicense {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How old is the person?");
		int age = Integer.parseInt(br.readLine());
		System.out.println("What score did they get?");
		int score = Integer.parseInt(br.readLine());

		boolean flag = validity(age, score);

		if (flag) {
			System.out.println("Age and test score passed, license awarded!");
		} else {
			System.out.println("Age or test score failed, license not awarded.");
		}
	}

	private static boolean validity(int ag, int sc) {
		if (ag>=18 && sc>=45) {
			return true;
		} else return false;
	}
}