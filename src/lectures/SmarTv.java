package lectures;

import java.util.Scanner;

public class SmarTv {

    private boolean turnedOn = false;
    private int channel;
    private int volume;

    public void controlTV(){

        Scanner sc = new Scanner(System.in);

        this.turnedOn = true;

        while (turnedOn) {
            System.out.println("Choose options:");
            System.out.println();
            System.out.print("Increase volume to: ");
            this.volume = sc.nextInt();
            System.out.print("Change channel to: ");
            this.channel = sc.nextInt();
            System.out.print("Turn off? 0 for yes | 1 for no: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                this.turnedOn = true;
                System.out.println("SmarTV Turned on: " + this.turnedOn
                    + " | Channel: " + this.channel
                    + " | Volume: " + this.volume);
            } else if (choice == 0) {
                this.turnedOn = false;
                System.out.println("SmarTV is now off!");
            }


        }

    }
}
