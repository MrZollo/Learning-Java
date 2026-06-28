import java.util.Scanner;

public class TestTransport {
    String Type;
    int Hours, Days;

    public static void main(String [] args){
        TestTransport ob = new TestTransport();
            ob.Display();
            ob.getInput();
            ob.SelectTrans();
    }

    public void getInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the type of Transport to rent (Car/Motorcycle): ");
            Type = scan.nextLine();
        System.out.println("Enter the number of Hours: ");
            Hours = scan.nextInt();
        System.out.println("Enter the number of Days: ");
            Days = scan.nextInt();
    }

    public void Display(){
        System.out.println("WELCOME TO MKN RENTAL TRANSPORT AGENCY");
        System.out.println("======================================");
        System.out.println("TYPE\t\tHOUR\tDAILY\tDISCOUNT PER/DAILY");
        System.out.println("Car\t\tRM15\tRM120\t\t10%");
        System.out.println("Motorcycle\tRM10\tRM60\t\t15%");
        System.out.println("======================================");
    }

    public void SelectTrans(){
        if (Type.equalsIgnoreCase("Car")){
            Car car = new Car();
            car.calcTotal(Hours, Days);
        }
        else if (Type.equalsIgnoreCase("Motorcycle")){
            Motorcycle moto = new Motorcycle();
            moto.calcTotal(Hours, Days);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
