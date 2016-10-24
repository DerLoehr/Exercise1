import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("Hello ASE2016 - how are you now? :)");
=======
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = in.readLine();
			HelloUser user = new HelloUser(input);
			user.greetUser();
		} catch (IOException e) {
			System.out.println("That is not a valid name!");
		}
>>>>>>> hello_user
	}

}
