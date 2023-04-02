package BasicsPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num = sc.nextInt();

        boolean isPrime = PrimeNumber.CheckPrime(num);

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.err.println("Not a Prime Number");
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
