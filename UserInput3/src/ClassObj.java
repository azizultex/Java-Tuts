
import java.util.Scanner;

public class ClassObj {

	public static void main(String[] args) {
		
		// Scanner obj
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\n");
		
		// Human obj
		Human azizultex = new Human();
		
		// input firstname
		System.out.println("Enter your first name: ");
		String fname = scanner.next();
		
		// input age 
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		// input country
		System.out.println("Enter your country: ");
		String country = scanner.next();
		
		azizultex.name(fname);
		azizultex.age(age);
		azizultex.country(country);
	}

}
