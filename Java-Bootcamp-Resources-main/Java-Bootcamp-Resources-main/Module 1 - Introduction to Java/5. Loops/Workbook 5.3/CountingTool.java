import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.

        System.out.print("Hi Karn, what number would you like to count up to?");
        int userInput=scan.nextInt();

        for(int i=0;i<=userInput;i++){
            System.out.print(i+ " ");
        }

        scan.close();
    }
}
