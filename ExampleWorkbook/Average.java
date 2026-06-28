package Example;
import java.util.Scanner;

public class Average{
    public static void main (String [] args){

        int num1, num2, num3, sum;
        float avg; 
        Scanner scan = new Scanner (System.in);
        System.out.print("Key in three number : ");
        num1 = scan.nextInt();
        num2 = scan.nextInt(); 
        num3 = scan.nextInt();
        System.out.println("You entering number are : " + num1 + ", " + num2 + ", " + num3 );

        sum = num1 + num2 + num3;
        avg = (float)sum / 3;

        System.out.println("Total : " + sum );
        System.out.printf("Average : %.2f",avg );
    }
}
