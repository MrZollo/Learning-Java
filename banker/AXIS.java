public class AXIS extends Bank{
    public AXIS(double rate){
        super(rate);
    }

    public void getRateOfInterest(){
        System.out.print("AXIS Interest rate : ");
        super.getRateOfInterest();
    }
}
