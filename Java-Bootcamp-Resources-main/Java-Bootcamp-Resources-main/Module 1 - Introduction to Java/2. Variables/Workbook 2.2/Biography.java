import java.util.jar.Attributes.Name;

public class Biography {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.2 to access the link).


        // name (text)
        String name="Karn";
        // age (whole number)
        int age=29;
        // country (text)
        String country="Canada";
        // sport (text)
        String sport="Soccer";
        // hours (whole number)
        int hours =1;
        // game (text)
        String game="PS4";
        // subject (text)
        String subject="ICS";
        // grade (character)
        char grade='A';
     
        System.out.println("My name is "+name+". I'm "+age+" years old, and I'm from "+country);
        System.out.println("My favourite sport is"+ sport+". I play for "+hours+" hours a day");
        System.out.println("When I'm tired, I like to play "+game+".");
        System.out.println("In school, my favourite subject was " +subject+", I scored a "+grade+".");

        // Compare your result to what's on Learn the Part.
    }
}
