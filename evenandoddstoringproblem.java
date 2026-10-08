package com.fueljava.array;

import java.util.Scanner;

public class evenandoddstoringproblem {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int even[] = new int[size];
        int odd[] = new int[size];

        int e = 0;
        int o = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even[e] = arr[i];
                e++;
            }
            else {
                odd[o] = arr[i];
                o++;
            }
        }

        System.out.print("Even Array:");
        for (int i = 0; i < e; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println();

        System.out.print("Odd Array:");
        for (int i = 0; i < o; i++) {
            System.out.print(odd[i] + " ");
        }
	}

}