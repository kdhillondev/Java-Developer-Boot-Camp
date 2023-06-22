import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){

        //Create scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Starting Java chatbot");
        System.out.println("Hello what is your name?");
        String firstName=sc.nextLine();

        System.out.println("\nHello "+firstName+" I am a chat bot.\nWhere are you from?");
        String city=sc.nextLine();

        System.out.println("\nI heard its beautiful in "+city+"! I am from a place called Orale.\nHow old are you?");
        int age=sc.nextInt();

        int x=400/age;
        System.out.println("Wow so cool! So you are "+age+" years old. I am 400 years old.\nI am currently "+x+"times older than you");
        System.out.println("\nEnough about me, so whats your favorite coding language? (dont just say python plz)");
        sc.nextLine();
        String language=sc.nextLine();

        System.out.println("]nNice so your favorite language is "+language+" mine is Java!");
    }
}
