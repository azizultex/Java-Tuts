
public class ArrayInMethod {

	public static void main(String[] args) {
		
		int grade[] = {4, 6, 9, 12};
		
		System.out.println("Original Array: \n");
		for( int g:grade) {
			System.out.println(g);
		}
		
		System.out.println("After adding 5: \n");
		
		Add5(grade);
		
		for( int g:grade) {
			System.out.println(g);
		}
	}
	
	public static void Add5(int arry[]) {
		for(int counter=1;counter<arry.length;counter++) {
			arry[counter] += 5;
		}
	}
	

}
