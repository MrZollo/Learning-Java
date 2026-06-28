import java.util.Scanner;

public class shape {
    public int height, width;

    public void display(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Height : ");
        height = scan.nextInt();

        System.out.print("Enter Width : ");
        width = scan.nextInt();

        System.out.println("Size shape with : ");
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
        
    }
}
