package algorithms.and.datastructures.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] myArray= {78,28,-8,56,-28,-3,17,28,33,12};
		int max;
		
		System.out.println("Array before sorted -->  "+Arrays.toString(myArray)+"\n\n");
		
		for(int i=myArray.length-1;i>0;i--)
		{
			max=0;
			for(int j=0;j<=i;j++)
			{
				if(myArray[j]>myArray[max])
				{
					max=j;
				}
			}
			swap(i,max,myArray);
			System.out.println("Array after sorted for the "+(10-i)+" iteration -->  "+Arrays.toString(myArray));
			
		}
		System.out.println("\n\nArray after sorted in the ascending order -->  "+Arrays.toString(myArray));
	}
	public static void swap(int first, int second, int[] myArray)
	{
		if(myArray[first]==myArray[second])
		{
			return;
		}
		
		int temp= myArray[first];
		myArray[first]=myArray[second];
		myArray[second]=temp;
	}


}
