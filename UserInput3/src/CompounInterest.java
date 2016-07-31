
public class CompounInterest {

	public static void main(String[] args) {
		
		double principal = 10000, rate = 0.1, result;
		
		for( int day=0; day<= 20; day++ ) {
			result = principal*Math.pow(1+rate, day);
			System.out.println( day + " day Value: " + result);
		}
	
	}
}