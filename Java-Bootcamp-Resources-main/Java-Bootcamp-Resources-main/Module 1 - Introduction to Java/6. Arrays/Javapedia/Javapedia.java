import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.

        int input= scan.nextInt();
        scan.nextLine();
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.   
        String[][] numbers=new String[input][3];      
         
 
        for (int i=0;i<numbers.length;i++) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
           // pick up and store figure's name.   
           String name=scan.nextLine();
           numbers[i][0]=name;

            System.out.print("\t - Date of birth: ");
           // pick up and store figure's birthday.
           String dob=scan.nextLine();
           numbers[i][1]=dob;

            System.out.print("\t - Occupation: ");
           // pick up and store figure's occupation. 
            String job=scan.nextLine();
            numbers[i][2]=job;

            System.out.print("\n");

        }
        
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 
        print2DArray(numbers);

        System.out.print("\nWho do you want information on? ");  
        String name=scan.nextLine();
        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i][0].equals(name)){
                for(int n=0;n<numbers[i].length;n++){
                    System.out.println(numbers[i][n]);
                }
            }
        }

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

     public static void print2DArray(String[][] db){
        for(int i=0;i<db.length;i++){
            for(int n=0;n<db[i].length;n++){
               if(db[i][n]==null){
                continue;
               }else{
                System.out.println(db[i][n]);
               }
            }
        }
     }

}
