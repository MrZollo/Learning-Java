package Example;
import java.util.Scanner;

public class Sample {
    public static void main (String args[]){ 
    int num;
    Scanner scan = new Scanner (System.in);

    System.out.print("Key in one number : ");
    num = scan.nextInt();

    System.out.println("**********************");

    if (num % 2 ==0)
        System.out.println(" The number is Genap");
    else
        System.out.println(" The number is Ganjil");

        System.out.println("**********************");
    }
}