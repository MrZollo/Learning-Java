package Example;

import java.util.Scanner;

public class Internship {
    public static void main(String args[]){

        Scanner scan = new Scanner (System.in);
        int totalcredit;
        String status;

        System.out.print("Please enter cumulative total credit: ");
        totalcredit = scan.nextInt();

        if (totalcredit >= 82 && totalcredit <= 100)
            status = "Eligible to attend industrial training";
        else if (totalcredit <= 82 && totalcredit >= 0) 
            status = "Continuing studies in PMJ";
        else
            status = "Invalid";
        
        System.out.println("Total Credit = " + totalcredit);
        System.out.println("Status = " + status);
    }
}
