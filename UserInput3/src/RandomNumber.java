import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
		Random rnum = new Random();
		int i = 0;
		
		while( i < 15 ) {
			int mynum = 1+rnum.nextInt(7);
			System.out.println(mynum);
			i++;
		}
	}

}
