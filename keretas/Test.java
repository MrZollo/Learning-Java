public class Test {
    public static void main(String [] args){
        car b1 = new car();
        
        b1.setColor("Blue");
        b1.setSpeed(200);
        b1.setSize(22);
        b1.type = "Super Car";
        b1.carType();

        System.out.println("Color of car : " + b1.getColor());
        System.out.println("Speed of car : " + b1.getSpeed());
        System.out.println("Size of car : " + b1.getSize());
    }
}
