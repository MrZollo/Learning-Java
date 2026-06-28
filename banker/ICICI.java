public class ICICI extends Bank{
    public ICICI(double rate){
        super(rate);
    }
    @Override
    public void getRateOfInterest(){
        System.out.print("ICICI Interest rate : ");
        super.getRateOfInterest();
    }
}
