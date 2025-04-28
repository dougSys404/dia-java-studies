package lectures;

public class Operators {


    public void arithmaticOperators(){
        System.out.println("Calling method arithmaticOperators");
        int number = 5;
        System.out.println("Variable number: " + number);
        System.out.println("Variable number (minus): " + (- number));
        System.out.println("Making variable number negative...");
        number = - number;
        System.out.println("Variable number: " + number);
        System.out.println("Making variable number positive...");
        number = + number * -1;
        System.out.println("Variable number: " + number);
    }
}
