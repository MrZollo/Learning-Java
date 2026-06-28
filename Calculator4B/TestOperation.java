package Activity4B;
import java.util.Scanner;

public class TestOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert number");
        double num1 = scan.nextDouble();
        Double num2 = scan.nextDouble();

        Operations Op = new Operations(num1 , num2);
        Op.show();
    }
}
