package Example;
import java.util.Scanner;

public class Exam{
    public static void main (String [] args){
        char letter;
        int num; 
        float dnum;
        Scanner scan = new Scanner (System.in);
        System.out.print("Key in one letter : ");
        letter = scan.next().charAt(0);
        System.out.print("Key in one integer number : ");
        num = scan.nextInt(); 
        System.out.print("Key in one decimal number : ");
        dnum = scan.nextFloat();
        System.out.println("You entering letter are : " + letter + ", " + num + ", " + dnum );
    }
}
