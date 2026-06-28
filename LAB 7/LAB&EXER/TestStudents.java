import java.util.Scanner;

public class TestStudents{
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String Name = scan.nextLine();

		System.out.print("Enter Ic Number : ");
		String IC = scan.nextLine();

		System.out.print("Enter Matrix Number : ");
		String Matrix = scan.nextLine();

		System.out.println("1. FullTime Student ");
		System.out.println("2. PartTime Student ");
		System.out.print("1 or 2 ? = ");
		int option = scan.nextInt();

		if(option == 1){
			Fulltime full = new Fulltime(Name , IC, Matrix);
			full.display();
		}
		else if (option == 2){
			Partime part = new Partime(Name, IC, Matrix);
			part.display();
		}
		else{
			System.out.println("Invalid student type.");
		}
	}
}