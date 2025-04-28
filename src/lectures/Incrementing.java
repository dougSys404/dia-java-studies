package lectures;

import java.util.Scanner;

public class Incrementing {

    public void incrementingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calling method incrementingNumber");
        System.out.println();
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Enter a final number increment: ");
        int finalIncrement = sc.nextInt();
        System.out.println();
        System.out.println("Starting looping");

        for (int i = 0; i < finalIncrement;i++){
            System.out.printf("Incrementing [%d] of number: %d: ", i, number);
            System.out.println();
            number++;
        }
        System.out.println();
        System.out.println("Decrementing number....(Until zero)");
        System.out.println();
        for (int i = finalIncrement; i > 0; i--){
            System.out.printf("Decrementing [%d] of number: %d", i, number);
            System.out.println();
            number--;
        }
    }


}
