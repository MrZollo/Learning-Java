package Shape;

public class bmicalc {
    public static void main( String [] args )
    {
        double Weight, Height, BMI;
        Weight = 140.0;
        Height = 67.0;

        BMI = 703*Weight/(Height*Height);
        System.out.println("BMI = " + BMI);

        Weight = 150.0;
        Height = 70.0;

        BMI = 703*Weight/(Height*Height);
        System.out.println("BMI = " + BMI);
    }
}
