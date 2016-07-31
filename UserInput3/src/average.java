import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// getinput
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average; 
		int counter = 0;
		
		while ( counter < 10 ) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		
		average = total/10;
		System.out.println("Your average number is: " + average );
		
	}

}
