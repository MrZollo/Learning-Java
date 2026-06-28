package ExampleWorkbook;
import java.util.Scanner;

public class Student2 {
    public String name, courseName;
    public int age;

    public double calcTotal(double CS1, double CS2){
        double total = CS1 + CS2;
        System.out.println("Total Mark of Case Study assessment is: " + total);
        return total;
    }

    public void show(){
        System.out.println("My Name is: " + name);
        System.out.println("My Age is: " + age);
        System.out.println("Course Name is: " + courseName);
    }
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Student2 s1 = new Student2();

        System.out.print("Please insert your name: ");
        s1.name = scan.nextLine();
    
        System.out.print("Please insert your age: ");
        s1.age = scan.nextInt();

        scan.nextLine();
        System.out.print("Enter the Course Name: ");
        s1.courseName = scan.nextLine();
        
        System.out.print("Please insert your marks of Study Case 1: ");
        double CS1 = scan.nextDouble();

        System.out.print("Please insert your marks of Study Case 2: ");
        double CS2 = scan.nextDouble();

        s1.show();
    }
}
