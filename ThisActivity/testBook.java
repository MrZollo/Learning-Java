import java.util.Scanner;

public class testBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert Book name: ");
        String bookname = scan.nextLine();
        
        System.out.println("Please insert Book author: ");
        String atorname = scan.nextLine();

        System.out.println("Please insert number of pages: ");
        int nopagesbuk = scan.nextInt();

        Book b1 = new Book (bookname, atorname, nopagesbuk);
        b1.display();
    }
}
