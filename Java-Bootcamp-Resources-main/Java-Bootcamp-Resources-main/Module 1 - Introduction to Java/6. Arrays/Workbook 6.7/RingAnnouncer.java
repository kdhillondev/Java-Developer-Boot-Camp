public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.7).

        for(String stat: record){
            if(stat.equals("WIN")) wins++;
            else losses++;
        }
        
        System.out.println("\nWith a professional record of "+ wins +" Wins and "+losses +"losses.");
        System.out.println("He is the pride of oracle: Java Fury!");


    }
}
