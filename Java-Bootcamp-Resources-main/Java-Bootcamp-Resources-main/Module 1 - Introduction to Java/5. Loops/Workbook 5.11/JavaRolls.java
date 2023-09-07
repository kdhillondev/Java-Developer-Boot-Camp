import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        int diceRoll;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        String statGame=scan.nextLine();

        //check if a int or string was pressed and handle the possible error
       
       
       System.out.println("Great, here are the rules:\\n" + //
               "");
               System.out.println("If you roll a 6, the game stops");
            System.out.println("If you roll a 4, nothing happens");
             System.out.println("Otherwise you get 1 point\n");
             System.out.println("You must colect 3 points to win");
             

             while(true){
                System.out.println("type anything to roll");
                String userSelection=scan.nextLine();

              
                 diceRoll=(int)((Math.random()*6)+1);
                 score++;
                 System.out.println("You rolled:"+diceRoll);
                 if(diceRoll==6) {
                    break;
                 }
                 else if (diceRoll==4) {
                    continue;
                 }
                 else if(score==3){
                   System.out.println("Congrats, you win!");
                   break;
                 }

             }
             scan.close();
           

             




    }
  
  

  
  
}
