import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     String username="Karn@gmail.com";
     String password="Password";


     
     System.out.print("Please enter your username:");
     String usernameInput=scan.nextLine();

     System.out.print("Please enter your password:");
     String passwordInput=scan.nextLine();

while(!username.equals(usernameInput) && !password.equals(passwordInput)){
    System.out.println("---------------");
       System.out.println("Incorrect please re enter your credentials");
       System.out.print("Please enter your username:");
       usernameInput=scan.nextLine();

       System.out.print("Please enter your password:");
       passwordInput=scan.nextLine();


     }

     System.out.println("Correct... now logging in");

        scan.close();
        
    }
}
