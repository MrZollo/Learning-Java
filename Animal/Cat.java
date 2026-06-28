public class Cat extends Pet{
    String favtoy = "balls";

    public Cat(String name, String species, int age){
        super(name, species, age);
    }

    public void display(){
        System.out.println("Cat Details :");
        super.display();
        System.out.println("Favourite Toy : " + favtoy);
    }
}
