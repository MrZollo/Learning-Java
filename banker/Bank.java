public class Bank {
    double rate;

    public Bank(double rate){
        this.rate = rate;
    }

    public void getRateOfInterest(){
        System.out.println(this.rate + "%");
    }
}
