import lectureGroup.MethodsLecture;
import lectureGroup.OperatorsLecture;
import lectures.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("STARTING MAIN PROGRAM!");
        System.out.println();
        System.out.println("Chose the lecture group!");
        System.out.println();
        System.out.println("1 - Operators lecture.");
        System.out.println("2 - Methods lecture.");
        System.out.print("Enter value: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1 -> OperatorsLecture.lectures();
            case 2 -> MethodsLecture.showLectures();
        }

    }
}