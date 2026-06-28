package ExampleWorkbook;
public class Student {
    private int stuNum;
    private double gpa;

public Student (int stuNum, double gpa){
    this.stuNum = stuNum;
    this.gpa = gpa;
    }

public void showStudent(){
    System.out.println("Student #" + stuNum + " gpa is " + gpa);
    }

public static void main(String[] args) {
        Student s1 = new Student(5, 3.99);

        s1.showStudent();
    }
}