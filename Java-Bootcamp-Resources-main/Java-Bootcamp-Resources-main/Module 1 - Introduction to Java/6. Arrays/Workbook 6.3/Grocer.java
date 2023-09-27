import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        String[] storeItems={"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).

        System.out.println("\nDo you sell:");
        Scanner scan= new Scanner(System.in);
        String input=scan.nextLine();

        int count=0;
        boolean foundItem=false;
        for(String item: storeItems){
            if (input.equalsIgnoreCase(input)){
                 System.out.println("\nWe have that in aisle: "+count);
                 foundItem=true;
            }
            count++;
        }

        if(!foundItem){
            System.out.println("sorry item is not for sale");
        }
    
    }
}
