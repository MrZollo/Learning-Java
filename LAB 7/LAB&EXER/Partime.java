import java.util.Scanner;

public class Partime extends Students{
	int subject;

	public Partime(String name,String IC,String Matrix)
	{
		super(name,IC,Matrix);
	}

	public void display()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of subject taken : ");
		subject = scan.nextInt();
		System.out.println("Your fees for this semester = RM " + subject * 500);
	}
}