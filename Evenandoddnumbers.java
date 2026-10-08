package com.fueljava.array;

import java.util.Scanner;

public class Evenandoddnumbers {
	public static void main(String arg[]) {
		
		int arr[] = {10,12,13,14,15,16,18,25,21};
		Scanner sc = new Scanner(System.in);
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
			
		{
			even++;
		}
		else {
			odd++;
		}
	}
		System.out.println("Even number = " +  even);
		System.out.println("Odd number = " +  odd);

}
}
