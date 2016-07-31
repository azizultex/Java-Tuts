import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		Scanner azizultex = new Scanner(System.in);
		azizultex.useDelimiter("\\n");
		
		while(true) {
			System.out.println("Menu Options: ");
			System.out.println(" (1) - do this");
			System.out.println(" (2) - quit this");
			
			System.out.println("Please enter your selection: ");
			int secl = azizultex.nextInt();
			
			if( secl == 1) {
				System.out.println("Your first name: ");
				String fname = azizultex.next();
				
				System.out.println("Your last name: ");
				String lname = azizultex.next();
				
				System.out.println("First name: " + fname );
				System.out.println("Last name: " + lname );
			} else if (secl == 2 ) {
				System.out.println("You have quited!");
				break;
			}
		}
	}

}
