/* implement multiple constructor from MultipleConstructor.java file */

public class getTime {
	public static void main( String[] args) {
		
		MultipleConstructor time = new MultipleConstructor();
		MultipleConstructor time1 = new MultipleConstructor(5, 6);
		MultipleConstructor time2 = new MultipleConstructor(7, 23);
		MultipleConstructor time3 = new MultipleConstructor(11, 34, 67);
		
		System.out.printf("%s\n", time.toMilitary());
		System.out.printf("%s\n", time1.toMilitary());
		System.out.printf("%s\n", time2.toMilitary());
		System.out.printf("%s\n", time3.toMilitary());
	}
	
}
