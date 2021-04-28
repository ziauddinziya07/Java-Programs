package main;

import java.util.Scanner;

public class PrintingEvenOdd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a range to print starting from: ");
        int l = s.nextInt();
        System.out.print("to: ");
        int r = s.nextInt();

        System.out.println("Odd Numbers between " + l + " to " + r + " are: ");
        odd(l, r);
        System.out.println("\nEven Numbers between " + l + " to " + r + " are: ");
        even(l, r);

    }

    static void even(int l, int r) {

        if (l > r) return;
        if (l % 2 == 0) System.out.print(l + " ");
        else l --;
        even(l += 2, r);
    }
    static void odd(int l, int r) {

        if (l > r) return;
        if (l % 2 != 0) System.out.print(l + " ");
        else l --;
        odd(l += 2, r);
    }
}
