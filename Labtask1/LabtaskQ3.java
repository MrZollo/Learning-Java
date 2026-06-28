package Labtask;
import java.util.Scanner;

public class LabtaskQ3 {
    public static void main( String [] args ){
        String course, Nama, uni, email, StudID;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("--------------------------------");
        System.out.println("\tMY DETAILS");
        System.out.println("--------------------------------");

        System.out.print("Name       : ");
        Nama = scan.next();
        System.out.print("Stud ID    : ");
        StudID = scan.next();
        System.out.print("Course     : ");
        course = scan.next();
        System.out.print("University : ");
        uni = scan.next();
        System.out.print("Email      : ");
        email = scan.next();
    }
}

