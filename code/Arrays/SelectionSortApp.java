package com.kodnest.arrays.Selectsort;

public class SelectionSortApp 
{
	public static int[] selectionSort(int[]arr)
	{
		//start the loop from 0th index until arr.length-2
		for(int i=0;i<=arr.length-2;i++)
		{
			//Assuming arr[i] is minimum elemnt,so assigning it to min
			int min=arr[i];
			//assigning indexi to pos
			int pos=i;
			//comparing every element after ith index,so j satrts from i+1
			for(int j=i+1;j<=arr.length-1;j++)
			{
				//comparing and checking whether arr[j]<min,if true,
				//replace min with arr[j] and pos with j
				
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			//swapping arr[i] with arr[pos]
			int temp;
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr;
		
	}

}
