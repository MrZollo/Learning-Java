package Example;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multiple;
        System.out.print("Please insert a value of multiplication table: ");
        int value = scan.nextInt();

        System.out.println("-------Multiplication Table Using For Loop-------");
        System.out.println("Multiples of " + value );

        for (int i=1; i<=12; i++){
            multiple = i * value;
            System.out.println(i + "*" + value + "-" + multiple);
        }
        
    }    
}
