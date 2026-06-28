package regis;
import LabTask2.Userinput;
import java.util.Scanner;

public class Mainmetod {
    public static void main(String[] args) {

        Userinput reg = new Userinput(100);
        Scanner scan = new Scanner(System.in);
        char YesNo;
        System.out.println("######################################");
        System.out.println("WELCOME TO SUKANEKA TAMAN CAHAYA SURIA");
        System.out.println("######################################");

        do {
            reg.details();
            System.out.print("NEXT REGISTRATION (Y/N) :");
            YesNo = scan.next().charAt(0);
        }while (YesNo == 'Y' || YesNo == 'y');

        reg.display();
        
    }
}
