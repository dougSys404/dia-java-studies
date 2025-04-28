package lectures;

import java.util.Scanner;

public class MakeBoolean {
    Scanner sc = new Scanner(System.in);
    public void makeTrueOrFalse(){
        boolean trueOrFalse;
        System.out.println("The variable 'trueOrFalse' currently is 'none', what do you want to do?");
        System.out.println("1 - Keep it true");
        System.out.println("2 - Make it false");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1) { trueOrFalse = true;}
        else if (choice == 2){ trueOrFalse = false;}
        else {throw new RuntimeException("Wrong option!");}
        System.out.println("You choose is: " + choice + "| The variable value is now " + trueOrFalse);
    }
}
