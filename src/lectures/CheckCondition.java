package lectures;

import java.util.Scanner;

public class CheckCondition {

    Scanner sc = new Scanner(System.in);

    public void checkCondition(){
        System.out.println("Calling method checkCondition");
        System.out.println();
        System.out.print("Enter first number: ");
        int numberOne = sc.nextInt();
        System.out.print("Enter second number: ");
        int numberTwo = sc.nextInt();

        String result = numberOne == numberTwo ?  "Equal" : "Not equal";
        System.out.println();
        System.out.println("The result is: " + result);
    }
}
