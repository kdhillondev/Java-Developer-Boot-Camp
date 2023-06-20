import java.util.Scanner;

public class Survey {
    public static void main(String[] args){
Scanner scanner =  new Scanner(System.in);
int counter=0;
System.out.println("\nWhat is your name?");
String name=scanner.nextLine();
counter++;

System.out.println("\nHow much money do you spend on coffee?");
double coffeePrice=scanner.nextDouble();
counter++;


System.out.println("\nHow much money do you spend on food?");
double foodPrice = scanner.nextDouble();
counter++;


System.out.println("How much money do you spend on coffee?");
int coffeeAmount=scanner.nextInt();
counter++;


System.out.println("How much money do you spend on food?");
int foodAmount=scanner.nextInt();
counter++;

scanner.close();

System.out.println("Thank you "+name+" for answering our questions");
System.out.println("You spend $"+(coffeeAmount+coffeePrice)+" on coffee");
System.out.println("You spend $"+(foodAmount+foodPrice)+" on food");


    }
}
