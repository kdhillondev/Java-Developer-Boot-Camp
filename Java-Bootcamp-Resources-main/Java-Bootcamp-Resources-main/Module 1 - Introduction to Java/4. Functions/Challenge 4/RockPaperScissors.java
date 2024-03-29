import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 



    String userInput=scan.nextLine();

    String userChoice;

   if(userInput.equalsIgnoreCase("yes")){
    System.out.println("Great!");
    System.out.println("rock - paper - scissors, shoot!");
    userChoice=scan.nextLine();
    String cpuChoice=computerChoice();
    String result=result(userChoice, cpuChoice);
    printResult(userChoice,cpuChoice,result);
    

   }else{
    System.out.println("Darn, some other time...!");
   }
    

    /*Task 2: Set up the game


       • if the answer is yes: 
             – print: Great!
             – print: rock - paper - scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:
             – print: Darn, some other time...!        
    */
              

        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    public static String computerChoice(){
        String choice="";

        int random=(int)(Math.random()*4)+1;

        switch(random){
            case 1:choice="rock"; break;
            case 2:choice="paper"; break;
            case 3:choice="scissors"; break;
            default: System.out.println("out of range failure"); System.exit(0); break;
        }
        return choice;

    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */




    //Task 4  – Write a function that compares the choices and returns the result.


    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if(yourChoice.equals(computerChoice)) {
            result="tie";
        }else if(yourChoice.equals("rock") && computerChoice.equals("scissors")){
            result="you win!";
        }else if (yourChoice.equals("paper") && computerChoice.equals("rock")){
            result="you win!";
        }else if (yourChoice.equals("scissors") && computerChoice.equals("rock")){
            result="you win!";
        }else if(yourChoice.equals("rock") && computerChoice.equals("paper")){
            result="you lose";
        }else if(yourChoice.equals("scissors") && computerChoice.equals("rock")){
            result="you lose";
        }else if (yourChoice.equals("paper") && computerChoice.equals("scissors") ){
            result="you lose";
        }else{
            result="INVALID CHOICE";
        }

        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose:          "+yourChoice);
        System.out.println("The computer chose: "+computerChoice);
        System.out.println(result);
     }

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

}
