import java.util.Scanner;

public class LuxuryPackage extends HolidayPackage {

    private String packageName;
    private double packagePrice; 
    private double totalPrice;
    private double discount;
    public String discountCode;

    public LuxuryPackage(String name, String phonenum, int quantity){
        super (name, phonenum, quantity);
        this.packagePrice = packagePrice;
        this.packageName = packageName;
        this.totalPrice = 0.0;
        this.discount = 50.0;
    }

        public void selectHotel() {
            System.out.println("Package   Code    Description              Price (RM)");
            System.out.println("           1.     Amari Hotel, JB          RM 950.00");
            System.out.println("           2.     Double Tree, JB          RM 1550.00");
            System.out.println("           3.     Suasana Suite Hotel, JB  RM 2550.00");

            Scanner scan = new Scanner (System.in);
            System.out.print("Enter Hotel Code (1-3): ");
            int pilihan = scan.nextInt();

            if (pilihan == 1){
                packagePrice = 950.00;
                packageName = "AMARI HOTEL, JOHOR BAHRU";
            } else if (pilihan == 2){
                packagePrice = 1550.00;
                packageName = "DOUBLE TREE BY HILTON, JOHOR BAHRU";
            } else if (pilihan == 3){
                packagePrice = 2550.00;
                packageName = "SUASANA SUITE HOTEL, JOHOR BAHRU";
            } else {
                System.out.println("Invalid Hotel Code");
                selectHotel();
            }
        }

    @Override
        public void calculatePrice() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Add on Jacuzzi & Spa for RM 250? (Y/N): ");
            String AddOnActivity = scan.next();

            double activityCost;
                if (AddOnActivity == "Y") {
                    activityCost = 250 * quantity;
                } else {
                    activityCost = 0;
                }

            totalPrice = (packagePrice * quantity) + activityCost;

    }

    @Override
        public void calculateDiscount() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Discount Code : ");
            discountCode = scan.next();

                if (discountCode == "AZ99") {
                    discount = 50.0; 
                } else {
                    System.out.println("Invalid Discount Code");
                }
    }

    @Override
        public void displaySummary() {
            super.displaySummary(); 
            System.out.println("\nPackage Name      : P003 - LUXURY PACKAGE");
            System.out.println("Hotel Name         : " + packageName);

            System.out.println("Package Price      : RM " + packagePrice);
            System.out.println("Jacuzzi & Spa       : RM 150.00 ");

            System.out.println("\nTotal Price      : RM " + totalPrice);
            System.out.println("Discount Code      : " + discountCode);
            System.out.println("Discount           : RM " + discount);

            double finalPrice = totalPrice - discount;
            System.out.println("After Discount     : RM " + finalPrice);

            Scanner scan = new Scanner(System.in);
            double amountReceived;
            do {
                System.out.print("Amount Received: RM ");
                amountReceived = scan.nextDouble();

                if (amountReceived < finalPrice) {
                    System.out.println("-> Short RM -" + finalPrice);
                } 
            } while (amountReceived < finalPrice);

        
            System.out.println("***** THANK YOU, ENJOY YOUR HOLIDAY *****");
        }

}
