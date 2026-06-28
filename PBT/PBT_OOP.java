import java.util.Scanner;
public class PBT_OOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the student's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the student's class: ");
            String studentClass = scanner.nextLine();

            int[] marks = new int[5];
            System.out.println("Enter the marks for the following subjects (0-100):");
            System.out.print("BM: ");
            marks[0] = scanner.nextInt();

            System.out.print("BI: ");
            marks[1] = scanner.nextInt();

            System.out.print("MATH: ");
            marks[2] = scanner.nextInt();

            System.out.print("SCIENCE: ");
            marks[3] = scanner.nextInt();

            System.out.print("HISTORY: ");
            marks[4] = scanner.nextInt();

            Student student = new Student(name, studentClass, marks);

            ReportCard reportCard = new ReportCard(student);
            reportCard.calculateTotalMarks();
            reportCard.calculateAverageMarks();
            reportCard.determineGrade();
            reportCard.displayReport();
        } catch (MarksException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only for marks.");
        } finally {
            scanner.close();
        }
    }
}
