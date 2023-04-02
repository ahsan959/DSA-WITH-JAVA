package BasicsPrograms;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers ");
        int num = sc.nextInt();

        System.out.println(ReverseInt(num));
    }

    public static int ReverseInt(int num) {
        int ans = 0;

        while (num != 0) {
            int digit = num % 10;

            num = num / 10;

            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            ans = (ans * 10) + digit;

        }
        return ans;

    }

}
