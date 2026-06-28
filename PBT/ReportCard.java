class ReportCard extends AbstractReport {
    public Student student;
    public int totalMarks;
    public double averageMarks;
    public char grade;

    public ReportCard(Student student) {
        this.student = student;
    }

    void calculateTotalMarks() {
        totalMarks = 0;
        for (int mark : student.getMarks()) {
            totalMarks += mark;
        }
    }

    void calculateAverageMarks() {
        averageMarks = totalMarks / 5.0;
    }

    void determineGrade() {
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayReport() {
        System.out.println("\n------- Student Information -------");
        System.out.println("\nName: " + student.getName());
        System.out.println("        Class: " + student.getStudentClass());
        System.out.println("\n----------- Marks Entered -----------");
        int[] marks = student.getMarks();
        System.out.println("               BM: " + marks[0]);
        System.out.println("               BI: " + marks[1]);
        System.out.println("              MATH: " + marks[2]);
        System.out.println("             SCIENCE: " + marks[3]);
        System.out.println("             HISTORY: " + marks[4]);
        System.out.println("_____________________________________");
        System.out.println("          Total Marks: " + totalMarks);
        System.out.println("         Average Marks: " + averageMarks);
        System.out.println("              Grade: " + grade);
    }
}
