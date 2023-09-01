import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       
       //See Learn the Part for detailed instructions.

       String answer="";
       int luckyNum=(int)(Math.random()*6)+1;

       while(!answer.equals(String.valueOf(luckyNum))){
        System.out.println("Guess again:");
        answer=scan.nextLine();
       }
        
        scan.close();
    }

}
