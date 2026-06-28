
public class Book {
    public String bookname, atorname;
    public int nopagesbuk;

    public Book (String bookname, String atorname, int nopagesbuk){
        this.bookname = bookname;
        this.atorname = atorname;
        this.nopagesbuk = nopagesbuk;
    }
    public void display(){
        System.out.println("Book Name is: " + this.bookname);
        System.out.println("Book Author is: " + this.atorname);
        System.out.println("Total Book Pages is: " + this.nopagesbuk);
    }
}
