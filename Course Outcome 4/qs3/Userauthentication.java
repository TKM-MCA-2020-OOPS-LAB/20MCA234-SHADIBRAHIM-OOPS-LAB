import java.util.Scanner;
class passwordException extends Exception {
	
	private static final long serialVersionUID = 1L;

	passwordException(String s){
		super(s);
	}

}
 class UsernameException extends Exception {

		private static final long serialVersionUID = 1L;

	
	public UsernameException(String msg) {
		super(msg);
	}

}
public class Userauthentication 
{
    public static void main(String[] args) {
		String username, password;
		 
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Username and Password"+"\n"+"----------------------------");
        System.out.print("\nENTER USERNAME:");
        username = sc.nextLine();
        System.out.print("ENTER PASSWORD:");
        password = sc.nextLine();
              
        sc.close();
        try
        {
           
    if(username==""){
		 throw new UsernameException("Fields cannot be empty!!!");
	 }
	 if(password==""){
		 throw new passwordException("Fields cannot be empty!!!");
	 }
	 else if (username.length()<6) {
		 throw new UsernameException("Username must be atmost 5 characters!");
	 }
	 else if (password.length()<8) {
		 throw new passwordException("Please enter a strong password");
	 }
	 if (!(password.contains("@") || password.contains("#")
             || password.contains("!") || password.contains("~")
             || password.contains("$") || password.contains("%")
             || password.contains("^") || password.contains("&")
             || password.contains("*") || password.contains("(")
             || password.contains(")") || password.contains("-")
             || password.contains("+") || password.contains("/")
             || password.contains(":") || password.contains(".")
             || password.contains(", ") || password.contains("<")
             || password.contains(">") || password.contains("?")
             || password.contains("|"))) {
           throw new passwordException("Password should contain at least one special character");
       }

	 else {
		 System.out.println("Login Successfully!!!");
	 
	 }
	 
        }
	 catch (UsernameException e) {
		 System.out.println("Exception Occurred. . "+e);
	 }
    catch (passwordException e) {
		 System.out.println("Exception Occurred. . "+e);
	 }

	}

    
}
