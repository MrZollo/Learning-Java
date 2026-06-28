package inherit;

public class Calculation {
    int sum, subs, mul;

    public void addition(int num1 , int num2){
        sum = num1 + num2;
        System.out.println("The sum of the given numbers: " + sum);
    }

    public void substraction(int num1 , int num2){
        subs = num1 - num2;
        System.out.println("The difference between the given numbers: " + subs);
    }

    public void convert(int num1 , int num2){
        if (num1 > num2){
            System.out.println(num1 + " is bigger than " + num2);
        }
        else {
            System.out.println(num2 + " is bigger than " + num1);
        }
    }
}
