public class Bird extends Pet{
    Double wingspan = 0.8;

    public Bird(String name, String species, int age){
        super(name, species, age);
    }

    public void display(){
        System.out.println("\nBird Details :");
        super.display();
        System.out.println("Wing Span : " + wingspan + " meter");
    }
}
