package main;


// Write a program to print the array elements using recursion.
public class PrintingArrayElements {

    public static void main(String[] args) {

        int []a = {7, 2, 6, 9, 4};
        System.out.println("The Array Elements are:  ");
        printArrayElements(a, 0);
    }

    static void printArrayElements(int []a, int i) {

        if (i == a.length) return;
        System.out.print(a[i] + "\t");
        printArrayElements(a, ++ i);
    }
}
