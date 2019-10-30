import java.io.*;

public class arrays {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int x;
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
	}
}