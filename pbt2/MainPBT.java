import java.util.Scanner;

public class MainPBT {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String studName, studClass;

        System.out.println("\n\t------- Student Information -------\n");
        System.out.print("\t           Name: ");
        studName = scan.nextLine();
        System.out.print("\t           Class: ");
        studClass = scan.nextLine();
        System.out.println("\n\t----------- Marks Entered -----------\n");

        Student stud = new GradeCalc(studName);
        GradeCalc gradeCalc = (GradeCalc) stud;

        gradeCalc.inputMarks();
        System.out.println("\n\t______________________________________\n");
        stud.calcTotal();
        stud.calcAverage();
        stud.calcGrade();
        stud.displayResult();
    }
}

