package LabTask2;
import java.util.Scanner;

public class Userinput {

    public String[] aMykid;
    public String[] aName;
    public int totSon = 0;

    public Userinput(int size) {
        aMykid = new String[size];
        aName = new String[size];
    }

    public void details(){
        Scanner scan = new Scanner(System.in);
        int ChildAge;
        String Name, Mykid;

        System.out.print("Please Enter Participant age : ");
        ChildAge = scan.nextInt();

        if (ChildAge >= 6 && ChildAge <= 10){
            System.out.println("Participant age is " + ChildAge);
            System.out.println("Allowed to join the activities");
            scan.nextLine();
            System.out.print("1. Please enter Participant name : ");
            Name = scan.nextLine();
            System.out.print("2. Please enter Mykid : ");
            Mykid = scan.nextLine();

            aName[totSon] = Name;
            aMykid[totSon] = Mykid;
            totSon++;
        }
        else if (ChildAge < 6 || ChildAge > 10){
            System.out.println("Not allowed to join the activities");
        }
        else {
            System.out.println("Please insert an integer value only");
        }
        System.out.println("***********************************************");
        System.out.println("The number of registration participan today " + totSon );
        System.out.println("***********************************************");
    }

    public void display() {
        System.out.println("----------------------------------------------------------");
        System.out.println("** LIST OF PARTICIPANTS FOR SUKANEKA TAMAN CAHAYA SURIA **");
        System.out.println( "No\t" + "Name\t" + "MyKID");

        for (int i = 0; i < totSon; i++) {
            System.out.println((i + 1) + "\t" + aName[i]+ "\t" + aMykid[i]);
        }
            System.out.println("Thank you :) ");
    }
}