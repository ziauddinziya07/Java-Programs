package main;

import java.util.Scanner;

public class LCMOfTwoNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter two Numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm(a, b, a > b ? a: b));
    }

    static int lcm(int a, int b, int max) {

          if (max % a == 0 && max % b == 0) return max;
          return lcm(a, b, ++ max);
    }
}
