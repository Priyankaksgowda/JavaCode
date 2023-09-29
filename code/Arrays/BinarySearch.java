package com.kodnest.arrays.sorting;

public class BinarySearch 
{
	public static void search(int[] arr,int key)
	{
	int low=0;
	int high=arr.length-1;
	int mid=(low+high)/2;
	for(int i=0;i<=arr.length-1;i++)
	{
	if(key==arr[mid])
	{
		System.out.println("key"+key+" found at index"+mid);
		return;
	}
	else if(arr[mid]>key)
	{
		low=mid+1;
		//high=high;
	}
	else
	{
		high=mid-1;
		//low=low;
	}
	}
	System.out.println("key not found");
	}

}
