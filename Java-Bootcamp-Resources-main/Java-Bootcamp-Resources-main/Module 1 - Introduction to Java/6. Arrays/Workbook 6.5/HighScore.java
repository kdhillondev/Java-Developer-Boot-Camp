public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

                int[] numberArray={randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};

System.out.print("Here are the scores: ");

                for (int i=0;i<numberArray.length;i++){
                    System.out.print(numberArray[i]+" ");
                    if(highScore<numberArray[i]){
                        highScore=numberArray[i];
                    }
                }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

        
    }    

    public static int randomNumber(){
        return (int) Math.random()*4999;
    }

}
