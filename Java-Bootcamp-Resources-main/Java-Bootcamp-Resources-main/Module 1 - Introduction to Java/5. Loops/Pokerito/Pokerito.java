import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Task 2: Explain the rules


        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */
        System.out.println(">Let's play Pokerito. Type anything when you're ready.\n");
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card.");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!\n");
        System.out.println("Ready? Type anything if you are.");

        String userInput=scan.nextLine();

        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */
        System.out.println("'Here's your card:'");
        String userCard=randomCard();
        System.out.println(userCard+"\n");
        String cpuCard=randomCard();
        System.out.println(cpuCard+"\n");


        int yourMatches = 0;
        int computerMatches =0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        String card1 = randomCard();
        //String card1=randomCard();
        String card2=randomCard();
        String card3=randomCard();
        String card4=randomCard();
        String card5=randomCard();

        int count=0;
        while(count<5){
            userInput=scan.nextLine();
            if(userInput.equals("")) count++;
            else{
                continue;
            }
            switch(count){
                case 1: System.out.println(card1); break;
                case 2: System.out.println(card2); break;
                case 3: System.out.println(card3); break;
                case 4: System.out.println(card4);break;
                case 5:System.out.println(card5);break;
                default:break;
            }
        }

       

        
        

        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

         int userScore=0;
         int cpuScore=0;
         
         if(userCard.equals(card1)) userScore++;
         if (userCard.equals(card2)) userScore++;
         if (userCard.equals(card3)) userScore++;
         if (userCard.equals(card4)) userScore++;
         if (userCard.equals(card5)) userScore++;

         if(cpuCard.equals(card1)) cpuScore++;
         if(cpuCard.equals(card2)) cpuScore++;
         if (cpuCard.equals(card3)) cpuScore++;
         if(cpuCard.equals(card4)) cpuScore++;
         if (cpuCard.equals(card5)) cpuScore++;

       
         if(userScore>cpuScore){
            System.out.println("user wins");
         }else if (cpuScore>userScore){
            System.out.println("cpu wins");
         }else{
            System.out.println("Tie!");
         }

         
         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */

     public static String randomCard(){

        int random =(int) (Math.random()*13+1);
        String card="";

        switch(random){
            case 1: card= "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
                   break;

            case 2: card=  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  break;

            case 3: card="   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";
                  break;

            case 4: card="   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
                   break;

            case 5: card="   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
                    break;

            case 6: card="   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
                    break;

            case 7: card= "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
                    break;

            case 8: card= "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
                    break;

            case 9: card= "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
                    break;

            case 10: card="   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
                    break;

            case 11: card= "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
                    break;

            case 12: card=  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
                    break;

            case 13: card="   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
                    break;

            default: break;
        }
        return card;

     }

}
