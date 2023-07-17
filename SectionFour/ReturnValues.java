public class ReturnValues{
    public static void main(String[] args){
        double area=calculateArea(2.3, 3.6);
        double area2=calculateArea(1.6, 2.6);
        double area3=calculateArea(2.6, 4.2);

        String englishexplanation=explainArea("English");
        String frenchexplanation=explainArea("french");
        String spanishexplanation=explainArea("spanish");

        calculateArea(-5, 2.3);

    }

    public static double calculateArea(double length, double width){
      if(length<0 || width<0){
        System.out.println("invalid dimensions");
       //System.exit() method exits current program by terminating running Java virtual machine. This method takes a status code. A non-zero value of status code is generally used to indicate abnormal termination. 
        System.exit(0);
      }
      
        double area=length*width;
        return area;
    }

    public static String explainArea(String language){

        switch(language){
            case "english": return "Area equals length * width"; 
            case "french": return "La surface est egale a la longueur * la largeur";
            case "spanish": return  "area es igual a largo * ancho";
            default: return "language not available";
        }

    }

    public static void printArea(double l, double w, double a){
System.out.println("A rectangle with a length of "+l+" and a width of "+w+" has an area of "+a);
    }
}

/*
 * 
 * English "Area equals length * width"

French "La surface est egale a la longueur * la largeur"

Spanish "area es igual a largo * ancho"
 */