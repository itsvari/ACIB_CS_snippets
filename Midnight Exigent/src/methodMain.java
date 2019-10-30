import java.io.*;

public class methodMain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;

		System.out.println("Enter the first number.");
		a = Integer.parseInt(br.readLine());

		System.out.println("Enter the second number.");
		b = Integer.parseInt(br.readLine());

		int c = methodDemo.getMin(a,b);
		System.out.println("The minimum number is " + c + ".");

		int d = methodDemo.getMax(a,b);
		System.out.println("The maximum number is " + d + ".");
	}
}
