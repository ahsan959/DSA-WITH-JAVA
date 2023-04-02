package BasicsPrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd.CheckEvenOrOdd();

    }

    public static void CheckEvenOrOdd() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
