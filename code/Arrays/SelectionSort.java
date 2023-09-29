package com.kodnest.arrays.Selectsort;

import java.util.Scanner;

public class SelectionSort
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
		
		
		//creating an array
		int[] arr=new int[sc.nextInt()];
		
		
		//storing the array elements
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		//displaying array elements before sorting
		System.out.println("Before sorting the array is");
		for(int i=0;i<=arr.length-1;i++)
		{
			  System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	
	    //calling bubble sorting() & sorting the returned sorted array is sortedArr
		int[] sortedArr= SelectionSortApp.selectionSort(arr);

			
			//displaying the array elements after sorting
			System.out.println("After sorting the array is");
			for(int i=0;i<=arr.length-1;i++)
			{
				  System.out.print(arr[i]+" ");
			}

	}
}


