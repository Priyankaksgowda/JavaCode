package com.kodnest.arrays.sorting;

public class BubbleSorting 
{
	public static int[] bubbleSorting(int[]arr)
	{
		int temp;
		//Picking every elements of an array
		for(int i=0;i<=arr.length-2;i++)
		{
			//comparing the elements with its next index element
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//if elements is greater than next element then swap
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}

}
