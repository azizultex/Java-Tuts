import java.util.Scanner;

public class girlfriend {

	public static void main(String[] args) {
		
//		Scanner getinput = new Scanner(System.in);
		GirlFriendClass gf = new GirlFriendClass("A name");
		GirlFriendClass gf2 = new GirlFriendClass("Something is going on");
//		
//		System.out.println("Enter your first gf name: ");
//		String gfname = getinput.nextLine();
		
//		gf.setName(gfname);
		
		gf.saying();
		gf2.saying();

	}

}
