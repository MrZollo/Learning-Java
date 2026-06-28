package Example;
import java.util.Scanner;

public class sampal1 {
    public static void main (String args[]){ 
    float grad;
    Scanner scan = new Scanner (System.in);

    System.out.print("Enter Total Marks : ");
    grad = scan.nextFloat();

    if (grad>=80 && grad<=100)
        System.out.println("Your Gred is A");
    else if (grad<79 && grad>=60)
        System.out.println("Your Gred is B");
    else if (grad<59 && grad>=40)
        System.out.println("Your Gred is C");
    else if (grad<39 && grad>=0)
        System.out.println("Your Gred is D");
    else
        System.out.println("Invalid Input");

    }
}