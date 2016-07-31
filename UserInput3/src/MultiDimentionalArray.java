import java.util.Arrays;
public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int one[][] = { {20, 21}, {22, 23, 24}, {25, 26, 27, 28, 29}};
		int two[][] = {{25, 26, 27}, {28, 29, 30, 31}, {32, 33}};
		
		for(int x[]:one) {
			System.out.println(Arrays.toString(x) + "\n");
			for(int y: x) {
				System.out.print(y + "\t");
			}
		}
		
	}

}
