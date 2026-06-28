import java.util.Scanner;

public class Booking  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = scan.nextLine();

            System.out.print("Enter Phone Number: ");
            String phonenum = scan.next();

            int quantity = 0;
            boolean validQuantity;

            do {
                System.out.print("Enter quantity: ");
                validQuantity = true;
                try {
                    quantity = scan.nextInt();

                    scan.nextLine();

                    if(quantity < 0) {
                        System.out.println("value should be more than 0");
                        validQuantity = false;
                    }
                    
                } catch (NumberFormatException e) {
                    System.out.println("You must enter a number in quantity.");
                    validQuantity = false;
                } 

            } while (!validQuantity);


            String packageType;
            HolidayPackage selectedPackage = null;

            while (true) {
                System.out.println("\n*****Available Packages:*****");
                System.out.println("Package Code      Description");
                System.out.println("        P001      ISLAND PACKAGE");
                System.out.println("        P002      VILLAGE PACKAGE");
                System.out.println("        P003      LUXURY PACKAGE");

                System.out.print("Enter Package Code : ");
                packageType = scan.nextLine().toUpperCase(); 

                switch (packageType) {
                    case "P001":
                        selectedPackage = new IslandPackage(name, phonenum, quantity);
                        ((IslandPackage) selectedPackage).selectIsland();
                        selectedPackage.calculatePrice();
                        selectedPackage.calculateDiscount();
                        break;

                    case "P002":
                        selectedPackage = new VillagePackage(name, phonenum, quantity);
                        ((VillagePackage) selectedPackage).selectVillage();
                        selectedPackage.calculatePrice();
                        selectedPackage.calculateDiscount();
                        break;

                    case "P003":
                        selectedPackage = new LuxuryPackage(name, phonenum, quantity);
                        ((LuxuryPackage) selectedPackage).selectHotel();
                        selectedPackage.calculatePrice();
                        selectedPackage.calculateDiscount();
                        break;

                    default:
                        System.out.println("Invalid Package Code.");
                        continue;
                }
                
                System.out.println("\nBooking Summary:");
                selectedPackage.displaySummary();
                break;
            }   

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
