public class ArrayLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print the elements of an integer array using a for loop
        int[] numbers = {22, 24, 26, 29, 30};
        // TODO: Use a for loop to print each element of the intArray

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // Example 2: Print the elements of a string array using a for loop

        // TODO: Use a for loop to print each element of the strArray

        String[] strArray = {"apple", "banana", "cherry"};

        for(int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }


        // Example 3: Print every second element of an integer array
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        // TODO: Use a for loop to print every second element of the grades array (step size of 2)

        for(int i=0;i<grades.length;i++){
            if(i%2==0){
                System.out.println(grades[i]);
            }
        }

        // Example 4: Double the elements of an integer array
        int[] values = {3, 5, 7, 9, 11};
        // TODO: Use a for loop to double each element in the values array

        for(int n: values){
            System.out.println(n*2);
        }

        // Example 5: Capitalize the elements of a string array
        String[] colors = {"red", "green", "blue"};
        // TODO: Use a for loop to capitalize each element in the colors array

        for(String color: colors){
            String updatedColor=color.substring(0,1);
            updatedColor=updatedColor.toUpperCase();
            updatedColor=updatedColor+color.substring(1, color.length());
            System.out.println(updatedColor);
        }

        // Example 6: Find the index of a specific value in an integer array
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        // TODO: Use a for loop to find the index of targetValue in the data array

        int increment=0;
        for (int number: data){
            if(number==targetValue){
                System.out.println("found at pos:"+increment);
            }
            increment++;
        }
    }
}