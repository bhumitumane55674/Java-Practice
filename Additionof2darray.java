package com.fueljava.array;

public class Additionof2darray {
		public static void main(String arg[]) {
			int x[][][] = {{{2,4,10,12},{3,6,4,8}}, {{4,8,9},{4,5,6}}};
			
			System.out.println("Sum of 1st and 3rd array: ");
			
			for(int i = 0; i < x[0][0].length && i < x[1][0].length; i++)
			{
				System.out.print(x[0][0][i] + x[1][0][i] + " ");
			}
			System.out.println();
			
			System.out.println("2nd + 4th array:");
			
			for(int i = 0; i < x[0][1].length && i < x[1][1].length; i++)
			{
				System.out.print(x[0][1][i] + x[1][1][i] + " ");
			}
				
			}
	}
	

