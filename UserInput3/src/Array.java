import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int numbers[] = { 5, 3, 6, 24, 64};
		String names[] = {"Rahim", "Karim", "Rafique", "Jabber", "Barkat"};
		
		Addition(numbers);
		Average(numbers);
		
		int i= 0;
		int sum = 0;
		
//		while (i < names.length) {
//			System.out.println(names[i]);
//			i++;
//		}
		
		while (i < numbers.length) {
			System.out.println(numbers[i]);
			sum += numbers[i];
			i++;
		}
		System.out.println("Sum of the array is: " + sum);
		
	}

	
	public static void Addition(int...numbers) {
		int sum = 0;
		for(int x: numbers) {
			sum += x;
		}
		System.out.println("Array " + Arrays.toString(numbers) + " addition is: " + sum);
	}
	
	
	public static void Average(int...numbers) {
		int sum = 0;
		for(int x:numbers) {
			sum += x;
		}
		int average = sum/numbers.length;
		System.out.println("Average for array " + Arrays.toString(numbers) + " is " + average);
	}
	
}