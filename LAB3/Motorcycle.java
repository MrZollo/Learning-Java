public class Motorcycle extends Transport{
    public Motorcycle(){
        super(10.0, 60.0, 0.15);
    }

    public void calcTotal(int hours, int days){
        Transport transport = new Transport(RateperHour, RateperDay, Discount);

        if (days > 0){
            double TotalCost = (hours * RateperHour) + (days * RateperDay);
            double TotalDis = TotalCost * Discount;
            System.out.println("Transport: Motorcycle");
            transport.Display();
            System.out.println("Total cost for " + hours + " hours and " + days + " days: RM" + (TotalCost-TotalDis));
        }
        else {
            System.out.println("Transport: Motorcycle");
            transport.Display();
            System.out.println("Total cost for " + hours + " hours and " + days + " days: RM" + (hours * 10.0));
        }
    }
}
