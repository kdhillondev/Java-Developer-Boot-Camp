public class Receipt {
    public static void main(String[] args) {


        String[] stores={"Gala", "Granny Smith", "Macintosh"};
        double[] prices={1.99, 1.49, 1.29};

        System.out.println("Here's your receipt:\n");
        
        // See instructions on Learn the Part (Workbook 6.8)

        for(int i=0;i<stores.length;i++){
            System.out.println(stores+":"+"$price "+prices[i]);
        }
        
        System.out.println("\t<apple i >: $<price i >"); // to be used in for loop.
    }
}
