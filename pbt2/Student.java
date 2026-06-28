abstract class Student { 
    String name;
    int totalMarks;
    double average;
    String grade;

    Student(String name) {
        this.name = name;
    }
    
    abstract void calcTotal();  //Abstract Method
    abstract void calcAverage();  
    abstract void calcGrade();  
    
    void displayResult() {
        System.out.println("                   Name: " + name);
        System.out.println("                   Total Marks: " + totalMarks);
        System.out.println("                   Average Marks: " + average);
        System.out.println("                   Grade: " + grade);
    }
}

