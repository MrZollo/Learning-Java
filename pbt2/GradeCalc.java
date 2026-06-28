import java.util.Scanner;

class GradeCalc extends Student { 
    int[] marks = new int[5]; //Subjects: BM, BI, Math, Science, History

    GradeCalc(String name) {
        super(name);
    }
    void inputMarks() {
        Scanner scan = new Scanner (System.in);
        String[] subjects = {"   BM", "   BI", "   Math", "   Science", "   History"};
        for (int i = 0; i < marks.length; i++) {
            System.out.print("\t\t" + subjects[i] + ": ");
            try {
                marks[i] = scan.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("Invalid marks! Must be between 0 and 100."); 
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--; 
                scan.nextLine();
            }
        }
    }
    @Override
    void calcTotal() {
        totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
    }

    //Calculate Average Marks
    @Override
    void calcAverage() { 
        average = totalMarks / 5.0;
    }
    @Override
    void calcGrade() { 
        if (average >= 90 && average <= 100) {
            grade = "A";
        } else if (average >= 80 && average <= 89) {
            grade = "B";
        } else if (average >= 70 && average <= 79) {
            grade = "C";
        } else if (average >= 60 && average <= 69) {
            grade = "D";
        } else if (average >= 50 && average <= 59) {
            grade = "E";
        } else {
            grade = "F";
        }
    }
}

