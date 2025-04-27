package lectures;

public class TypesAndVariables {

    private int age;
    private double smallSalary = 2.500;
    private double salary = 2500;
    private String name;
    private final int QUANTITY_MONTHS_YEAR = 12;
    private final double PI = 3.14;

    public void showClass(){
        System.out.println("Calling void method showClass");
        System.out.println();
        this.age = 18;
        this.name = "Jonh Green";

        System.out.printf("Variable age value: %d%n" +
                "Variable smallSalary value: %.2f%n" +
                "Variable salary value: %.2f%n" +
                "Variable name value: %s%n",
                age, smallSalary, salary, name);
        System.out.println();

    }

    public void showCastNumbers(){
        System.out.println("Calling void method showCastNumbers");
        System.out.println();
        short shortNumber = 1;
        System.out.println("Outputing shortnumber: " + shortNumber);
        int ordnaryNumber = shortNumber;
        System.out.println("Outputing ordnaryNumber (INT number recieving shortNumber): " + ordnaryNumber);
        short shortNumber2 = (short)ordnaryNumber;
        System.out.println("Outputing shortNumber2 (short number recieving ordnaryNumber, needs casting): " + ordnaryNumber);
        System.out.println();
    }

    public void showConstants(){
        System.out.println("Calling void method showConstants");
        System.out.println("Quantity of months in year: " + this.QUANTITY_MONTHS_YEAR);
        System.out.println("PI's value: " + this.PI);
    }
}
