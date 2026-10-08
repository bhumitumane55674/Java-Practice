package com.fueljava.array;

public class evenandoddcount {
	public static void main(String arg[]) {
		int arr[] = {10,12,13,14,15,16,17,18,20,22};
		
		System.out.print("Even number: ");
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + ", ");
			
			}			  
		}
		System.out.println();

		System.out.print("Odd numbers: ");
				
				for(int i = 0; i < arr.length; i++)
				{
					if(arr[i] % 2 != 0)
					{
						System.out.print(arr[i] + ", ");
					}
				}
					System.out.println();
				}
			}
			
			

