package main;

// Write a program to get the largest element of an array using recursion.
public class MaxElementOfArray {

    public static void main(String[] args) {

        int []a = {7, 2, 6, 9, 4};
        System.out.println("Maximum element of the array: " + maxElement(a, 1, a[0]));
    }

    static int maxElement(int []a, int i, int max) {

        if (i == a.length) return max;
        if (a[i] > max) max = a[i];
        return maxElement(a, ++ i, max);
    }
}
