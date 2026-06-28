import java.util.Scanner;

class form {

    String StudName, StudSex, institusi, program;
    int StudAge;
    double pbMark, paMark, totalmark, avgmark;

    public void input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please insert student name: ");
        StudName = scan.nextLine();
        
        System.out.print("Please insert student gender: ");
        StudSex = scan.nextLine();

        System.out.print("Please insert student age: ");
        StudAge = scan.nextInt();

        scan.nextLine();

        System.out.print("Please insert student Institutions: ");
        institusi = scan.nextLine();

        System.out.print("Please insert student Programme: ");
        program = scan.nextLine();

        System.out.print("Please insert Continuos marks: ");
        pbMark = scan.nextDouble();

        System.out.print("Please insert Final examination marks: ");
        paMark = scan.nextDouble();

        totalmark = pbMark + paMark;
        avgmark = totalmark/2;  
    }

    public void display(){
        System.out.println("\n----------Profile Information----------");
        System.out.println("Hi, " + StudName + " You are " + StudSex + ". Your age now is " + StudAge + " years old." + " You studied in " + institusi + " in " + program + " programme.");
        System.out.println("\n----------Marks Information----------");
        System.out.println("Continuos marks is " + pbMark);
        System.out.println("Final examination marks is " + paMark);
        System.out.println("Total marks is " + totalmark);
        System.out.println("Average marks is " + avgmark);
    }
    public static void main(String[] args) {
        
        form f1 = new form();
        f1.input();
        f1.display();
    }
}
