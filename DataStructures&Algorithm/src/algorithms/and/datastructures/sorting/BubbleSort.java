package algorithms.and.datastructures.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] myArray= {78,28,-8,56,-28,-3,17,28,33,12};
		
		System.out.println("Array before sorted -->  "+Arrays.toString(myArray)+"\n\n");
		
		for(int i=myArray.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(myArray[j]>myArray[j+1])
				{
					swap(j,j+1,myArray);
				}
			}
			System.out.println("Array after sorted for the "+(10-i)+" iteration -->  "+Arrays.toString(myArray));
		}
		
		System.out.println("\n\nArray after sorted in the ascending order -->  "+Arrays.toString(myArray));

	}
	public static void swap(int first, int second, int[] firstArray)
	{
		int temp= firstArray[first];
		firstArray[first]=firstArray[second];
		firstArray[second]=temp;
	}

}
