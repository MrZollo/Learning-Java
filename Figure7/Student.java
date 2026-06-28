public class Student {
    public String StudName, StudSex;
    public int StudAge;

    public Student(){
        System.out.println("Constructing no argument constructor");
        StudName = "Leborn Jebon";
        StudSex = "Male";
        StudAge = 20;
    }

    public Student(String StudName, String StudSex, int StudAge){
        System.out.println("Constructing parameterized constructor");
        this.StudName = StudName;
        this.StudSex = StudSex;
        this.StudAge = StudAge;
    }

    public void display(){
        System.out.println("Student Name is: " + StudName);
        System.out.println("Student Gender is: " + StudSex);
        System.out.println("Student Age is: " + StudAge);
    }
}
