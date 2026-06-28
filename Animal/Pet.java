public class Pet {
    String name, species;
    int age;

    public Pet(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Species : "+ species);
        System.out.println("Age : "+ age);
    }
}
