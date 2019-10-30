import java.io.*;

public class exvoid {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the mark received to get the rank.");
		Double input = Double.parseDouble(br.readLine());

		methodRankPoints(input);
	}

	public static void methodRankPoints(double points) {
		if (points >= 202.5) {
			System.out.println("Rank: A1");
		} else if (points >= 122.4) {
			System.out.println("Rank: A2");
		} else {
			System.out.println("Rank: A3");
		}
	}
}