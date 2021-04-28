package main;

import java.util.Scanner;

// Count numbers in given range such that sum of even digits is greater than sum of odd digits
public class CountNumbersSumEvenDigitsGreaterThanSumOddDigits {

    static int c = 0;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int l, r;
        System.out.println("Enter a positive range like (1-100) starting from: ");
        l = s.nextInt();
        System.out.println("to: ");
        r = s.nextInt();

        System.out.println("The numbers which satisfies the condition: ");
        System.out.print("\nThere are " + countNumbers(l, r) + " in the range of " + l + " - " + r );
        System.out.println( " such that sum of even digits is greater than sum of odd digits in a number");
    }

    static int countNumbers(int l, int r) {

        if (l > r) return c;
        if (checkEvenSum(l)) {
            c ++;
            System.out.print(l + " ");
        };
        return countNumbers(++ l, r);
    }

    static boolean checkEvenSum(int x) {

        int esum = 0;
        int osum = 0;

        while(x != 0) {

            int temp  = x % 10;
            if (temp % 2 == 0) esum += temp;
            else    osum += temp;
            x /= 10;
        }
        if (esum > osum) return true;
        else return false;
    }
}
