public class DiplomatIT extends Student {
    String name;
    public void details(){
        super.name = "Student";
        name = "Diploma Student";
        System.out.println(super.name + " and " + name);
    }
    public static void main (String [] args){
        DiplomatIT diploma = new DiplomatIT();
        diploma.details();
    }
}