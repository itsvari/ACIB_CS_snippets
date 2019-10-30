import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class areaCircleRectangle {
	static double pi = 3.14;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean stop = false;

		while (!stop) {
			System.out.println("Which shape do you want to calculate?");
			System.out.println("[1] Rectangle");
			System.out.println("[2] Circle");

			switch (Integer.parseInt(br.readLine())) {
				case 1:
					System.out.println("Rectangle selected.");

					System.out.println("Enter the width of the rectangle.");
					double width = Double.parseDouble(br.readLine());
					System.out.println("Enter the height of the rectangle.");
					double height = Double.parseDouble(br.readLine());

					System.out.println("The area is " + rectArea(width, height));

					stop = true;
					break;
				case 2:
					System.out.println("Circle selected.");

					System.out.println("Enter the radius of the circle.");
					double rad = Double.parseDouble(br.readLine());

					System.out.println("The area is " + circArea(rad));
					stop = true;
					break;
				default:
					System.out.println("That is not a valid option.");
			}
		}

	}

	private static double rectArea(double w, double h) {
		return w * h;
	}

	private static double circArea(double r) {
		double r2 = Math.pow(r, 2);
		return pi * r2;
	}
}
