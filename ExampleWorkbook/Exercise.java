package Example;

import java.util.Scanner;
import java.util.jar.Attributes;

public class Exercise {
    public static void main (String [] args){
        String Nama, StudID;
        float GPA;
        Scanner scan = new Scanner(System.in);

        System.out.print("Name       : ");
        Nama = scan.nextLine();
        System.out.print("Stud ID    : ");
        StudID = scan.next();
        System.out.print("HPNM       : ");
        GPA = scan.nextFloat();

        System.out.println("********** Student Information **********");
        System.out.println("Nama       : " + Nama);
        System.out.println("Student ID : " + StudID);
        System.out.printf("HPNM       : %.2f", GPA);
    }
}
