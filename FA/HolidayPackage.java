abstract class HolidayPackage{
    public String phonenum, name;
    public int quantity;

    public HolidayPackage(String name, String phonenum, int quantity){
        this.name = name;
        this.phonenum = phonenum;
        this.quantity = quantity;
    }

    abstract void calculatePrice();
    abstract void calculateDiscount();

    public void displaySummary(){
        System.out.println("\n************ ORDER INFO ************");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phonenum);
        System.out.println("Quantity: " + quantity);
    }
    
}