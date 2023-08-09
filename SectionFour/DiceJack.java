import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
        int roll1=rollDice();
int roll2=rollDice();
int roll3=rollDice();

System.out.println(roll1);
System.out.println(roll2);
System.out.println(roll3);

System.out.print("Enter three numbers between 1-6: ");
int num1=scanner.nextInt();
int num2=scanner.nextInt();
int num3=scanner.nextInt();

 boolean firstResult=areLessThanOne(num1, num2, num3);
boolean secondResult=areHigherThanSix(num1, num2, num3);

if(firstResult || secondResult){
    System.out.println("You entered numbers outside the valid range");
    System.exit(0);
}

int sum = num1+num2+num3;

int roll=(int)(Math.random()*7+1);

int size=Math.abs(sum-roll);

boolean game=results(sum, size, roll);

if(game){
    System.out.println("user won");
}else{
    System.out.println("user lost");
}
 

scanner.close();

}

public static boolean results(int sum, int size, int roll){
    if(sum>roll && size<3) {
       return true;
        
    }
    return false;

}

    public static int rollDice(){
        double roll=Math.random()*6+1;
        return (int)roll;
    }

    public static boolean results(double user, double computer){
    boolean result=false;
    if(user>computer) result= true;
    return result;
    }

    public static boolean areLessThanOne(int x, int y, int z){
if (x<1 || y<1 || z<1){
    return true;
}else{
    return false;
}
    }

    public static boolean areHigherThanSix(int x, int y, int z){
    if(x>6 || y>6 || z>6) return true;
    else return false;
}
    
}

