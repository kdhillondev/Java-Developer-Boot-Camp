public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch

        switch(weather){
            case "sunny":System.out.println("its sunny");
            case "rainy":System.out.println("its rainy");
            default:break;
        }

        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch
        switch(role){
            case 1:System.out.println("you are a a admin"); break;
            default: System.out.println("please contact an admin"); break;
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if(temperature>=80 && humidity>=60){
            System.out.println("its to hot and humid");
        }else if(temperature >=80){
            System.out.println("its too hot\n");
        }else if(temperature<=60 && humidity>=60){
            System.out.println("its too cold and humid");
        }else if(temperature<=60){
System.out.println("its too cold");
        }else{
            System.out.println("its too comfortable");
        }
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        if(age>=18 && age<=60 && income>=30000){
System.out.println("congratulations! you are eligible for the credit card\n");
        }else{
            System.out.println("sorry, you are not eligible for the credit card");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

switch(lightColor){
 case "green":System.out.println("Go!"); break;
    case "yellow":System.out.println("slow down"); break;
    case "red":System.out.println("stop"); break;
    default: System.out.println("power outage");
}
   


        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        if(grade>=80 ){
            System.out.println("you got an A");
        }else if(grade>=70 && grade<80){
            System.out.println("you got a B");
        }else if(grade>=60 && grade<70){
            System.out.println("you got a C");
        }else if(grade>=50 && grade<60){
            System.out.println("you got a D");
        }else{
            System.out.println("you got an F");
        }
        

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        switch(browser){
            case "Chrome":System.out.println("chrome"); break;
            case "firefox":System.out.println("firefox"); break;
            default: System.out.println("unkown"); break;
        }

    
    }
}