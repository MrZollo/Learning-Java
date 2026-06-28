package Example;
import java.util.Scanner;

public class Casher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 9876.90; 
        double amountWithdrawal = 0.00;
        int chekBal, YesNo;
        
        do { 
            YesNo = 0;
            System.out.print("Choose a transaction <1-Check Balance> <2-Withcdrawal> :");
            chekBal = scan.nextInt();
            
            if (chekBal == 1){
                System.out.println("-----Menu Check Balance-----");
                System.out.println("Your Balance is RM:" + balance);
                System.out.println("Do you want to continue: <1-yes> <2-no>");
                YesNo = scan.nextInt();
            }

            else if (chekBal == 2){
                System.out.println("Enter amount of money to withdrawal");
                amountWithdrawal = scan.nextDouble();
                if (amountWithdrawal < balance){
                    System.out.println("Amount RM" + amountWithdrawal + " will be deduct from balance in account.");
                }
                else {
                    System.out.println("Sorry not enough balance");
                }
                System.out.println("Do you want to continue: <1-yes> <2-no>");
                YesNo = scan.nextInt();
            }

            else{
                System.out.println("Wrong Choice. Try again");
                System.out.println("Do you want to continue: <1-yes> <2-no>");
                YesNo = scan.nextInt();
            }

        } while (YesNo == 1);
    }
}
