import lectures.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Choose the lecture by number or enter 0 to quit");
            System.out.println();
            System.out.println("1 - Types and variables");
            System.out.println("2 - Operators");
            System.out.println("3 - Incrementing");
            System.out.println("4 - Boolean");
            System.out.println("5 - Ternary");
            System.out.println("6 - Relational Operators");
            System.out.println("7 - Logical Operators");
            System.out.print("Choice: ");
            int choose = sc.nextInt();

            switch (choose){
                case 0:
                    System.out.println("End of program");
                    break;
                case 1:
                    TypesAndVariables typesAndVariables = new TypesAndVariables();
                    typesAndVariables.showClass();
                    typesAndVariables.showCastNumbers();
                    typesAndVariables.showConstants();
                    break;
                case 2:
                    Operators operators = new Operators();
                    operators.arithmaticOperators();
                    break;
                case 3:
                    Incrementing incrementing = new Incrementing();
                    incrementing.incrementingNumber();
                    break;
                case 4:
                    MakeBoolean makeBoolean = new MakeBoolean();
                    makeBoolean.makeTrueOrFalse();
                    break;
                case 5:
                    CheckCondition checkCondition = new CheckCondition();
                    checkCondition.checkCondition();
                    break;

                case 6:
                    RelationalOperators relationalOperators = new RelationalOperators();
                    relationalOperators.greaterOrLess();
                    relationalOperators.compareNames();
                    break;
                case 7:
                    LogicalOperators logicalOperators = new LogicalOperators();
                    logicalOperators.logicCondition();
                    break;
                default:
                    System.out.println("Wrong option!");

            }




    }
}