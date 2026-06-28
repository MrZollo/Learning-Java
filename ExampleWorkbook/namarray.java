package ExampleWorkbook;
import java.util.Scanner;

public class namarray {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int k;
        int total = 0;

        System.out.print("\nEnter number of student : ");
        k = scan.nextInt();
        int[] mark = new int[k];

        System.out.print("\n");
        
        for (int i=0; i<k; i++){
            int j = i+1;
            System.out.print("Enter Marks Student " + j + " : ");
            mark[i] = scan.nextInt();
        }

        System.out.print("\n");

        int x = 0;
		char grade;
		for (int y = 1; y <= k; y++){
		    if (mark[x] >=80 && mark[x] <= 100){
                    grade = 'A';
                }
                else if (mark[x] >= 60 && mark[x] < 80){
                    grade = 'B';
                }
                else if (mark[x] >=40 && mark[x]< 60){
                    grade = 'C';
                }
                else if (mark[x] >=40 && mark[x]< 60){
                    grade = 'D';
                }
                else {
                    grade = 'F';
                }

            System.out.println("Grade Student " + y + ": " + grade);
            x++;
        }

        for (int i= 0; i<k; i++){
            total += mark[i];
        }
        
        int avg = mark.length;
        System.out.println("\nTotal Mark : " + total);
        System.out.println("\nAverage : " + total/avg);
    }    
}
