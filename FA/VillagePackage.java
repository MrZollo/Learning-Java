import java.util.Scanner;

public class VillagePackage extends HolidayPackage {

    private String packageName;
    private double packagePrice; 
    private double totalPrice;
    private double discount;
    public String discountCode;

    public VillagePackage(String name, String phonenum, int quantity){
        super (name, phonenum, quantity);
        this.packagePrice = packagePrice;
        this.packageName = packageName;
        this.totalPrice = 0.0;
        this.discount = 50.0;
    }

        public void selectVillage() {
            System.out.println("Package   Code    Description              Price (RM)");
            System.out.println("           1.     Kampung Air Puteri       RM 300.00");
            System.out.println("           2.     Kampung Sir Pantai       RM 400.00");
            System.out.println("           3.     Kampung Sri Lalang       RM 500.00");

            Scanner scan = new Scanner (System.in);
            System.out.print("Enter Village Code (1-3): ");
            int pilihan = scan.nextInt();

            if (pilihan == 1){
                packagePrice = 300.00;
                packageName = "KAMPUNG AIR PUTERI, MERSING";
            } else if (pilihan == 2){
                packagePrice = 400.00;
                packageName = "KAMPUNG SIR PANTAI, MERSING";
            } else if (pilihan == 3){
                packagePrice = 500.00;
                packageName = "KAMPUNG SRI LALANG, MERSING";
            } else {
                System.out.println("Invalid Village Code");
                selectVillage();
            }
        }

    @Override
        public void calculatePrice() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Add on Cycling for RM 60? (Y/N): ");
            String AddOnActivity = scan.next();

            double activityCost;
                if (AddOnActivity == "Y") {
                    activityCost = 60 * quantity;
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
            System.out.println("\nPackage Name      : P002 - VILLAGE PACKAGE");
            System.out.println("Village Name       : " + packageName);

            System.out.println("Package Price      : RM " + packagePrice);
            System.out.println("Cycling       : RM 150.00 ");

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
