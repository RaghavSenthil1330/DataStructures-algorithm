package algorithms.and.datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] myArray= {78,28,-8,56,-28,-3,17,28,33,12};
		
		System.out.println("Array before sorted -->  "+Arrays.toString(myArray)+"\n\n");
				
		for(int i=1;i<myArray.length;i++)
		{
			int temp=myArray[i];
			int j;
			for(j=i;j>0;j--)
			{
				if(temp<myArray[j-1])
				{
					myArray[j]=myArray[j-1];
				}
				else
				{
					break;
				}
			}
			myArray[j]=temp;
			//System.out.println();
			System.out.println("Array after sorted for the "+i+" iteration -->  "+Arrays.toString(myArray));
		}
		System.out.println("\n\nArray after sorted in the ascending order -->  "+Arrays.toString(myArray));
	}

}
