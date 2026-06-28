class Student{
	
	String name; 
	String IC;
	String Matrix;

	Student(String name,String IC,String Matrix)
	{
		this.name = name;
		this.IC = IC;
		this.Matrix = Matrix;
	}

	public void display(){
		System.out.println("Name : " + name);
		System.out.println("IC : " + IC);
		System.out.println("Matrix : " + Matrix);
	}
}