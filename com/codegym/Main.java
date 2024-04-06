package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        int[] index_del;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        array = new int[size];
        index_del = new int[size];

        int a = 0;
        while (a < array.length) {
            System.out.print("Enter element " + (a + 1) + " : ");
            array[a] = scanner.nextInt();
            a++;
        }

        int elmement;
        int count = 0;
        System.out.print("Enter the element you want to delete: ");
        elmement = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (elmement == array[i]) {
                index_del[count] = i;
                System.out.println("Position " + (index_del[count] + 1));
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Number " + elmement + " does not appear in the list!");
        } else {
            for (int n = 0; n < count; n++) {
                int i = index_del[n];
                if (elmement == array[i - n]) {
                    for (int j = i - n; j < array.length - 1; j++)
                        array[j] = array[j + 1];
                }
            }
            System.out.print("New array: ");
            for (int j = 0; j < array.length - count; j++)
                System.out.print(array[j] + "\t");
        }
    }
}