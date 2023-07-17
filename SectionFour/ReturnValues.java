public class ReturnValues{
    public static void main(String[] args){
        double area=calculateArea(2.3, 3.6);
        double area2=calculateArea(1.6, 2.6);
        double area3=calculateArea(2.6, 4.2);

        String englishexplanation=explainArea("English");
        String frenchexplanation=explainArea("french");
        String spanishexplanation=explainArea("spanish");


    }

    public static double calculateArea(double length, double width){
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
}

/*
 * 
 * English "Area equals length * width"

French "La surface est egale a la longueur * la largeur"

Spanish "area es igual a largo * ancho"
 */