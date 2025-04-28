package lectureGroup;

import lectures.SmarTv;

import java.util.Scanner;

public final class MethodsLecture {

    public static void showLectures(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lecture's number:");
        System.out.println();
        System.out.println("1 - SmarTV");
        System.out.println("0 - Quit");
        System.out.print("Enter option: ");

        int choose = sc.nextInt();

        switch (choose) {
            case 0:
                System.out.println("End of program");
                break;
            case 1:
                SmarTv smarTv = new SmarTv();
                smarTv.controlTV();
                break;
            default:
                System.out.println("Wrong option!");
        }
    }
}
