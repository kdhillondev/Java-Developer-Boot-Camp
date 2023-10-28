import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.
            char[][] board={
              {'_','_','_'},
              {'_','_','_'},
              {'_','_','_'}
            };
            String name="test";

            //Task 2: Call the function printBoard();
            printBoard(board);


           
            boolean gameHasWinner=false;
             for(int i=1;i<=9;i++){
            System.out.print("Turn ");
              if(i%2==0){
                 System.out.println("X:");
                //First players turn when counter is even
                int[] spot=askUser(board);
                board[spot[0]][spot[1]]='X';
                printBoard(board);

              }else{
                System.out.println("O:");
                //Second players turn when counter is odd
                int[] spot=askUser(board);
                board[spot[0]][spot[1]]='O';
                printBoard(board);
              }


              int checkscore=checkWin(board);
              if (checkscore==3){
                System.out.println("X wins");
                gameHasWinner=true;
                break;
              }else if(checkscore==-3){
                System.out.println("O wins");
                gameHasWinner=true;
                break;

              }
             }


              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }



                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */

             
            scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */        

        public static void printBoard(char[][] board){
          for(int i=0;i<board.length;i++){
            for(int n=0;n<board[i].length;n++){
              System.out.print(board[i][n]+" ");
            }
            System.out.println();
          }
           System.out.println();
        }
   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */

     public static int[] askUser(char[][]board){

     int[]userSelection=new int[2];
      while(true){
        System.out.print("\tPick a row and column :");
        int row= scan.nextInt();
        int element=scan.nextInt();
        userSelection[0]=row;
        userSelection[1]=element;

        if(board[row][element]!='_'){
          System.out.println("Sorry please try again");
      }
      else{
        break;
      }
      }
     

     return userSelection;
     }


     public static int checkWin(char board[][]){

      int count=0;

       //check every row
      for(int i=0;i<board.length;i++){
        if( ((board[i][0]=='X')&&(board[i][1]=='X')&&(board[i][2]=='X'))){
          count=3;
        }
        else if( ((board[i][0]=='O')&&(board[i][1]=='O')&&(board[i][2]=='O'))){
          count=-3;
        }
      }

//check every COLUMN
        for(int i=0;i<board.length;i++){
          if((board[0][i]=='X')&&(board[1][i]=='X')&&(board[2][i]=='X')){
              count=3;
          }
          else if ((board[0][i]=='O')&&(board[1][i]=='O')&&(board[2][i]=='O')){
            count=-3;
        }
      }


         //check left diagnol
          if((board[0][0]=='X')&&(board[1][1]=='X')&&(board[2][2]=='X')){
            count=3;
          }
          else if((board[0][0]=='O')&&(board[1][1]=='O')&&(board[2][2]=='O')){
            count=-3;
          }
 

if((board[0][2]=='X')&&(board[1][1]=='X')&&(board[2][0]=='X')){
            count=3;
          }
          else if((board[0][2]=='O')&&(board[1][1]=='O')&&(board[2][0]=='O')){
            count=-3;
          }

/*
       
       

        
          if((board[0][2]=='X')&&(board[1][1]=='X')&&(board[2][0]=='X')){
            count=3;
          }
          else if((board[0][2]=='O')&&(board[1][1]=='O')&&(board[2][0]=='O')){
            count=-3;
          }
        
 */


      return count;
     }

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */


     /*
      *Shabbat means stop, you should not walk on shabbos the same way you walk in the week.
      Dont talk about the same things you do during the week, on shabbos.

      Hashem from the point of creation, makes it appear as if he is not there anymore.

      There is nothing but hashem, but the world was created through hashems speech.

      The whole universe is based on nothing but movement, and if we got elect




      */

}
