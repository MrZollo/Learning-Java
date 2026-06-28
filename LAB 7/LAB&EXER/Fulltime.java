public class Fulltime extends Student{
	public Fulltime(String name, String IC, String Matrix)
	{
		super(name,IC,Matrix);
	}

	public void display()
	{
		super.display();
		System.out.println("Your fees for this semester is RM 2000 ");
	}
}