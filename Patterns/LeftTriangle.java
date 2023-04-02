package Patterns;

public class LeftTriangle {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5 - 1; j > 1; j--) {
                System.out.println(" ");

                // for printing the Columns
                for (int j2 = 0; j2 <= i; j2++) {
                    System.out.print("*");
                }

                System.out.println("");
            }
        }

    }

}
