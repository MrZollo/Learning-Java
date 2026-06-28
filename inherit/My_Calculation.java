package inherit;
import java.util.Scanner;

public class My_Calculation extends Calculation{ 
    public void multiplication(int num1, int num2 ){
        mul = num1 * num2 ;
        System.out.println("The product of the given numbers: " + mul);
    }

    public static void main( String args[] ){
    int num1, num2;
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        num1 = scan.nextInt();
        System.out.print("Enter Num 2 : ");
        num2 = scan.nextInt();
    My_Calculation demo = new My_Calculation();
        demo.addition( num1, num2 );
        demo.substraction( num1, num2 );
        demo.multiplication( num1, num2 ); 
        demo.convert(num1 , num2);
        }
}