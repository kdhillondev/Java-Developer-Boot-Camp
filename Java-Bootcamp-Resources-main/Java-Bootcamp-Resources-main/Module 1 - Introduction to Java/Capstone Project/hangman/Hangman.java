import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        System.out.println("Welcome to hangman");

        int incorrectGuessCount=0;


        //pick random word
        String wordChoice=randomWord();
       
        //create an array of empty spaces
        String[] guessSpace= new String[wordChoice.length()];
        for(int i=0;i<guessSpace.length;i++){
            guessSpace[i]="_";
        }

      

        //loop from here check for lives

        while(incorrectGuessCount<7){
                    System.out.println(gallows[incorrectGuessCount]);


              for(int i=0;i<guessSpace.length;i++){
            //print spaces to screen
            System.out.print(guessSpace[i]+" ");
        }
        System.out.println("\n");


        Scanner scan= new Scanner(System.in);

        System.out.print("Take a guess at a letter:");
        String userGuess=scan.nextLine();

        String[] results=roundOfGame(userGuess,wordChoice);

        if(results[0]=="correct"){
            //if correct we update the letters in guessSpace, then display it on refresh
           for(int i=0;i<wordChoice.length();i++){

            char[] charArray=wordChoice.toCharArray();
           
            if(results[1].charAt(0)==charArray[i]){
                guessSpace[i]=results[1];
             //   System.out.print(guessSpace[i]);
            }
      
           }
           System.out.println("\n");

           //check if user won
            boolean gameOver=checkWin(wordChoice, guessSpace);
            if(gameOver){
              System.out.println(Arrays.toString(guessSpace));
                System.out.println("Congrats you win");
                scan.close();

                break;
           

        }
           
    }else{
        //update counter, image, and display on refresh
        incorrectGuessCount++;
    }


        }

if(incorrectGuessCount==7){
    System.out.println("you loose");
}




    }

    public static boolean checkWin(String wordChoice, String[] guessSpace){

        boolean gameWin=false;
        StringBuilder builder = new StringBuilder();
        for(String s : guessSpace) {
            builder.append(s);
        }
        String str = builder.toString();        
        System.out.println(wordChoice);
        if(str.equals(wordChoice)) gameWin=true;

        return gameWin;
    }

    public static String randomWord(){
    //THis function returns a random word from the array.
        int randomNum=(int) (Math.random()*25)+1;
        String word=words[randomNum];
        return word;
    }

    public static String[] roundOfGame(String userInput,String wordChoice){
//create a function that checks the users guess with the letters in the word
String[]results={"none","none"};
for(int i=0;i<wordChoice.length();i++){
    char c=wordChoice.charAt(i);
    if(c==userInput.charAt(0)){
        results[0]="correct";
        results[1]=String.valueOf(c);
    }
}
   return results;     
    }

}





