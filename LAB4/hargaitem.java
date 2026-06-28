import java.util.InputMismatchException;
import java.util.Scanner;

public class hargaitem {

    double price, pd, pad;
    int diskon;

    public void pricess() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter 5 price items (RM): ");
            for (int i = 0; i < 5; i++) {
                double itemPrice = scan.nextDouble();
                price += itemPrice; 
            }
            System.out.println("Total Price: RM " + price);

        } catch (InputMismatchException e) {
            System.out.println("Wrong input: Only positive numbers are accepted for price.");
        } 
    }

    public void discount() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("\nEnter discount given (%) : ");
            diskon = scan.nextInt();

            System.out.println("Discount applied: " + diskon + "%");

            pd = price * (diskon / 100.0);
            pad = price - pd;

            if (diskon < 0 || diskon > 100) {
                throw new InputMismatchException("Wrong input: Only numbers between 0 and 100 are accepted for discount.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Please enter a valid discount rate");
            diskon = 0;
        }
    }

    public void display() {
        System.out.println("\n-------------DETAILS INFORMATION-------------");
        System.out.println("Total Price : RM " + price);
        System.out.println("Discount : " + diskon + "%");
        System.out.println("Price Discount : RM " + pd);
        System.out.println("Price After Discount : RM " + pad);
    }
}
