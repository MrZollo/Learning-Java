public class Transport {
    double RateperHour, RateperDay, Discount;

    public Transport(double RateperHour, double RateperDay, double Discount){
        this.RateperHour = RateperHour;
        this.RateperDay = RateperDay;
        this.Discount = Discount;
    }

    public void Display(){
        System.out.println("Rate Per Hour : RM" + RateperHour);
        System.out.println("Rate Per Day : RM" + RateperDay);
    }
}