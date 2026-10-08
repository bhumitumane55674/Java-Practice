package com.fueljava.array;

public class countduplicatenumber {
	public static void main(String arg[]) {
		
		int arr[] =  {10,20,30,10,50};
		
		for(int i = 0;  i < arr.length; i++)
		{
			int count = 0;
			
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j]) {
					count ++;
				}
			}
			System.out.println("count =" + count);
		}
	}

}
