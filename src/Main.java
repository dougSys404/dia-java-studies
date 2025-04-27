import lectures.TypesAndVariables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Choose the lecture or 0 to quit");
            System.out.println();
            System.out.println();
            System.out.println("1 - Types and variables");
            System.out.println();
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
                    System.out.println("to do");
                default:
                    System.out.println("Wrong option!");
            }




    }
}