package BasicsPrograms;

public class Factorial {
    public static void main(String[] args) {
        Factorial.FindFact();

    }

    public static void FindFact() {
        int number = 5;
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            // factorial Condition
            fact = fact * i;

        }
        System.out.println("Given Number Factorial is: " + fact);
    }

}
