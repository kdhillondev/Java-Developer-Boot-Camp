import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.

   Scanner scan=new Scanner(System.in);
       
   System.out.println("Java doubles");
        int dice1=-1;
        int dice2=-2;
        int count=0;

            System.out.print("type 'roll' until you hit doubles");

        while(dice1!=dice2){
            if(count==0){

            }
            else{
             System.out.println("try again:");

            }
            String userInput=scan.nextLine();
            if(userInput.equalsIgnoreCase("ROLL")){
                dice1=(int) (Math.random()*6)+1;
                dice2=(int) (Math.random()*6)+1;
                System.out.println(dice1+" "+dice2);

            }else{
                System.out.println("incorrect input, please type 'roll':");
                userInput=scan.nextLine();
                dice1=(int) (Math.random()*6)+1;
                dice2=(int) (Math.random()*6)+1;
                                System.out.println(dice1+" "+dice2);

            }
            count++;
        }

        System.out.println("Nice you win!");

    }

}





