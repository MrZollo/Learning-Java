public class Methodoverloaded {
    void add(){
        System.out.println("No Parameter");
    }

    void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("add 2 INT. Result " + sum);
    }
    
    double add(double num1, double num2){
        double result = num1 + num2;
        System.out.println("add 2 Double num. ");
        return result;
    }

    public static void main(String[] args) {
        Methodoverloaded ob = new Methodoverloaded();
        double result;
        
        ob.add();
        ob.add(10, 20);
        result = ob.add(10.5, 20.9);
        System.out.println("result: " + result);

    }
}
