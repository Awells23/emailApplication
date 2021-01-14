package EmailApp;
import java.util.*;
public class EmailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("First name: ");
		String first = in.next();
		System.out.print("Last name: ");
		String last = in.next();
		email em1 = new email(first,last); 
		
		em1.changePassword("password");
		em1.setAlternateEmail("Alexwells1977@gmail.com");
		em1.getAlternateEmail(); 
		em1.getPassword(); 
		
		System.out.println(em1.showContents());
	}

}
