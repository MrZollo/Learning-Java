public class Car extends Transport{
    public Car(){
        super(15.0, 120.0, 0.1);
    }

    public void calcTotal(int hours, int days){
        Transport transport = new Transport(RateperHour, RateperDay, Discount);

        if (days > 0){
            double TotalCost = (hours * RateperHour) + (days * RateperDay);
            double TotalDis = TotalCost * Discount;
            System.out.println("Transport: Car");
            transport.Display();
            System.out.println("Total cost for " + hours + " hours and " + days + " days: RM" + (TotalCost-TotalDis));
        }
        else {
            System.out.println("Transport: Car");
            transport.Display();
            System.out.println("Total cost for " + hours + " hours and " + days + " days: RM" + (hours * 15.0));
        }
    }
}
