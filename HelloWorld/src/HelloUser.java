
public class HelloUser {

	private String userName;
	
	public HelloUser(String name) {
		this.userName = name;
	}
	
	public void greetUser() {
		System.out.println("Hello "+this.userName+"!");
	}
}
