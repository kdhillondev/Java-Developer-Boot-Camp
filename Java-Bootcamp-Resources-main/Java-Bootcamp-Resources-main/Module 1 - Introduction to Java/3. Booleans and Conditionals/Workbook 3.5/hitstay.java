import java.util.Scanner;

public class hitstay{
    public static void main(String[]args){
        System.out.println("Would you like to hit or stay?");
Scanner scan= new Scanner(System.in);
String option = scan.nextLine();

if(!option.equals("hit") || !option.equals("stay")){
System.out.println("\nInvalid Option");
} else{
System.out.println("\nEnd Turn.");
}
    }
}