package lectures;

import java.util.Scanner;

public class LogicalOperators {

    Scanner sc = new Scanner(System.in);

    public void logicCondition(){
        System.out.println("Calling method logicCondition!");
        System.out.println();
        System.out.print("Enter 1 for true or 2 for false: ");
        int readConditionOne = sc.nextInt();
        System.out.print("Enter 1 for true or 2 for false: ");
        int readConditionTwo = sc.nextInt();

        boolean conditionOne = readConditionOne == 1 ? true : false;
        boolean conditionTwo = readConditionTwo == 1 ? true : false;

        String resultAND = conditionOne && conditionTwo ? "The comparison is true" : "The comparison is false";
        String resultOR = conditionOne || conditionTwo ? "The comparison is true" : "The comparison is false";

        System.out.println("First value: " + conditionOne);
        System.out.println("Second value: " + conditionTwo);
        System.out.println();
        System.out.println("Comparison using AND operator: " + resultAND);
        System.out.println();
        System.out.println("Comparison using OR operator: " + resultOR);
    }
}
