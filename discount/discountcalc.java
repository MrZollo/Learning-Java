import java.util.Scanner;

public class discountcalc {
    int item;
    double price, totprice, totalDiscont, pricenett;

    public void input(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\n");
        System.out.print("Enter Price Per Item : ");
        price = scan.nextDouble();

        System.out.print("Enter Quantity : ");
        item = scan.nextInt();

        System.out.println("*******************************");

        totprice = price * item;

        System.out.println("Total Price : " + totprice);
        System.out.println("Price after Discount : " + calc());
    }

    public double calc(){
        
        if (totprice > 500){
            totalDiscont = (0.09*totprice);
            pricenett = totprice - totalDiscont;
        }
        else if (totprice <= 500 && totprice >= 201){
            totalDiscont=(0.07*totprice);
            pricenett = totprice - totalDiscont;
        }
        else if (totprice <= 200 && totprice >= 100){
            totalDiscont=(0.05*totprice);
            pricenett = totprice - totalDiscont;
        }
        else {
            totalDiscont=item*price;
            pricenett = totprice - totalDiscont;
        }
        return pricenett;
    }
}



