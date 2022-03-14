import java.util.Scanner;

public class PasswordValidation {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println(
				"It's time to create a password!\n"
				 +"Your password must:\n"
				+ "-Include at least one uppercase letter\n"
				+ "-Include at least one lowercase letter\n"
				+ "-Include an exclamation point (!)\n"
				+ "-Be between 7 and 12 characters total\n");
		
		System.out.print("Please enter a valid password: ");
		String x = scnr.next();
		
		if (isValid(x)) {
            System.out.println("Password is valid and accepted");
        } else {
            System.out.println("Error");
        }
	}

	// check if password is valid or not
    public static boolean isValid(String password)
    {
 
        // checking if password length
        // is between 7 and 12
        if (!((password.length() >= 7)
              && (password.length() <= 12))) {
            return false;
        }
        
        // for special characters
        if (!(password.contains("!"))) {
            return false;
        }
 
        if (true) {
            int count = 0;
 
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
 
                // type casting
                char c = (char)i;
 
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
 
        if (true) {
            int count = 0;
 
            // checking lowercase letters
            for (int i = 90; i <= 122; i++) {
 
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
 
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
 
        // if all conditions fails
        return true;
    } 
    
}
	
	