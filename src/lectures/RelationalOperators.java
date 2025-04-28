package lectures;

import java.util.Scanner;

public class RelationalOperators {

    Scanner sc = new Scanner(System.in);

    public void greaterOrLess(){
        System.out.println("Calling method greaterOrLess");
        System.out.println();
        System.out.print("Enter the first number: ");
        int numberOne = sc.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = sc.nextInt();

        System.out.println();

        if (numberOne > numberTwo) {
            System.out.println("Number one is greater than number two!");

        }

        if (numberOne < numberTwo) {
            System.out.println("Number one is less than number two!");
        }

        if (numberOne == numberTwo){
            System.out.println("Number one is equal to number two!");
        }

        System.out.println();
    }

    public void compareNames(){
        System.out.println("Calling method compareNames");
        System.out.print("Enter the first name:");
        String firstName = sc.next();
        System.out.print("Enter the second name:");
        String secondName = sc.next();

        String result = firstName.equals(secondName) ? "Names are equal" : "Names are different";
        System.out.println("NOTE: The result using operator == reading value by input keyboard are always false" +
                " in that case, the method equals are necessary " +
                "unless you give the value inside the code");

        System.out.println(result);
    }
}
