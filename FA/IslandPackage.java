import java.util.Scanner;

public class IslandPackage extends HolidayPackage {

    public String AddOnActivity, packageName, Islandname, discountCode;
    public double totalPrice, packagePrice;
    public double discount;

    public IslandPackage(String name, String phonenum, int quantity){
        super (name, phonenum, quantity);
        this.packagePrice = packagePrice;
        this.packageName = packageName;
        this.totalPrice = 0.0;
        this.discount = 50.0;
    }

        public void selectIsland() {
            System.out.println("Package   Code    Description            Price (RM)");
            System.out.println("           1.     Tinggi Island          RM 550.00");
            System.out.println("           2.     Tioman Island          RM 720.00");
            System.out.println("           3.     Rawa Island            RM 1100.50");

            Scanner scan = new Scanner (System.in);
            System.out.print("Enter Island Code (1-3): ");
            int pilihan = scan.nextInt();

            if (pilihan == 1){
                packagePrice = 550.00;
                packageName = "TINGGI ISLAND";
            } else if (pilihan == 2){
                packagePrice = 720.00;
                packageName = "TIOMAN ISLAND";
            } else if (pilihan == 3){
                packagePrice = 1100.50;
                packageName = "RAWA ISLAND";
            } else {
                System.out.println("Invalid Island Code");
                selectIsland();
            }
        }

    @Override
        public void calculatePrice() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Add on Snorkeling for RM 150? (Y/N): ");
            AddOnActivity = scan.nextLine().toUpperCase();

            double activityCost;
                if ("Y".equals(AddOnActivity)) {
                    activityCost = 150;
                } else {
                    activityCost = 0;
                }

            totalPrice = (packagePrice + activityCost) * quantity;
            
    }

    double finalPrice;
    @Override
        public void calculateDiscount() {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter Discount Code : ");
				discountCode = scan.nextLine();

                if (!"A001".equals(discountCode)){
                    throw new IllegalArgumentException("Invalid Discount code");
				}

			} catch(Exception e){
				System.out.println(e.getMessage());
			}
            
            if(discountCode == "A001"){
                discount = 50.0;
            }

			finalPrice = totalPrice - discount;
           
    }

    @Override
        public void displaySummary() {
            super.displaySummary(); 
            System.out.println("\nPackage Name      : P001 - ISLAND PACKAGE");
            System.out.println("Island Name        : " + packageName);

            System.out.println("Package Price      : RM " + packagePrice);

            if (AddOnActivity.equals("y") || AddOnActivity.equalsIgnoreCase("Y")){
                System.out.println("Snorkeling       : RM 150.00 ");
            }

            System.out.println("\nTotal Price      : RM " + totalPrice);

            if (discountCode.equalsIgnoreCase("A001")){
                System.out.println("Discount Code      : " + discountCode);
                System.out.println("Discount           : RM " + discount);
                System.out.println("After Discount     : RM " + finalPrice);
            }
            
            Scanner scan = new Scanner(System.in);
            double amountReceived;

            do {
                System.out.print("Amount Received: RM ");
                amountReceived = scan.nextDouble();

                if (amountReceived < finalPrice) {
                    System.out.println("-> Short RM " + (amountReceived - finalPrice));
                } 
                finalPrice -= amountReceived;
            } while (finalPrice > 0);

            double balance = 0 - finalPrice;
		    System.out.println("Balance \t : RM " + balance);
        
            System.out.println("***** THANK YOU, ENJOY YOUR HOLIDAY *****");
        }

}

