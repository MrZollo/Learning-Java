public class SBI extends Bank{
    public SBI(double rate){
        super(rate);
    }

    public void getRateOfInterest(){
        System.out.print("SBI Interest rate : ");
        super.getRateOfInterest();
    }
}