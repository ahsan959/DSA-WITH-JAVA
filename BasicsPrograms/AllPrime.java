package BasicsPrograms;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isiPrime = CheckPrime(i);

            if (isiPrime) {
                System.out.print(" " + i);
            }

        }

    }

    public static boolean CheckPrime(int num) {

        for (int i = 2; i < num; i++) {
            // Condition for prime Number
            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }

}
