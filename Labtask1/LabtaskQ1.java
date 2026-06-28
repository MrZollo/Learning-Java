package Labtask;

public class LabtaskQ1 {
    public static void main(String[] args)
    {
        double eValue = 2.718281828;
        String greet = "Selamat Sejahtera";

        System.out.print(greet);
        System.out.println(" Semua ");

        for (int j=0; j<8; j++){
            System.out.println("inside loop");
            if (j%3 == 0){
                System.out.print("inside");
                System.out.print(" if selection!");
            }
        }
    }
}
