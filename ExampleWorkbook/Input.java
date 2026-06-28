package Shape;

import java.util.Scanner;

public class Input {
    public static void main (String[] args){
        String theWord;
        int theWholeNumber;
        double theRealNumber;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string : ");
        theWord = scan.next();
        System.out.println("Enter an integer : ");
        theWholeNumber = scan.nextInt();
        System.out.println("Enter a pointing : ");
        theRealNumber = scan.nextDouble();

        System.out.print("You have entered ");
        System.out.print(theWord);
        System.out.print(", ");
        System.out.print(theWholeNumber);
        System.out.print(", ");
        System.out.print(theRealNumber);
        System.out.println();

    }
    
}
