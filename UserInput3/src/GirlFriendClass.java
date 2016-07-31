
public class GirlFriendClass {

	// instance ( class variable )
	private String girlName;
	
	// constructor method
	public GirlFriendClass(String name) {
		girlName = name;
	}
	
	public void setName( String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first girl friend %s\n", getName());
	}
}
