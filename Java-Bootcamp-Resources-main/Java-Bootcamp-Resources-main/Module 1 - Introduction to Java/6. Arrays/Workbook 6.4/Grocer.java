import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.4).
        
        Scanner scan = new Scanner(System.in);        
        
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        String userInput=scan.nextLine();
        boolean foundItem=false;
        for (int i = 0; i < store.length; i++) {
            
           if(userInput.equalsIgnoreCase(store[i])){
            System.out.println("\nWe have that in aisle: "+i);
            foundItem=true;

           }


        }
        if(!foundItem){
            System.out.println("Sorry we do not have that item for sale");
        }
        
        scan.close();
        
        // Compare your result to what's on Learn the Part.

    }
}
