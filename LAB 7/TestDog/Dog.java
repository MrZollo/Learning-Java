public class Dog extends Animal
{
	Dog()
	{
		super();
	}
	Dog(int age)
	{
		super(age);
	}
	public void move()
	{
		super.move();
		System.out.println("Dogs can walk and run");
	}
}