package Activity4B;

public class Operations {
    public double num1, num2, add, div, subs, multi;

    public Operations(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

   double addition(){
        add = num1 + num2;
        return add;    
    }    

    double divide(){
        div = num1 / num2;
        return div;
    } 

    double substact(){
        subs = num1 - num2;
        return subs;   
    } 

    double multiply(){
        multi = num1 - num2;
        return multi;
    } 

    public void show(){
        System.out.println("Add" + this.num1 "s" this.num2 + add);
        System.out.println("Div" + num1 " / " num2 + div);
        System.out.println("Subs" + num1 " - " num2 + subs);
        System.out.println("Multiply" + num1 " X " num2 + multi);
    
    }
}
