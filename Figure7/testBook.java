import java.util.Scanner;

public class testBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student s1 = new Student();
        s1.display();

        System.out.println("Please insert student name: ");
        String StudName = scan.nextLine();
        
        System.out.println("Please insert student gender: ");
        String StudSex = scan.nextLine();

        System.out.println("Please insert student age: ");
        int StudAge = scan.nextInt();

        Student s2 = new Student (StudName, StudSex, StudAge);
        s2.display();
    }
}
