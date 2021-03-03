package algorithms.and.datastructures.arrays;

public class Linearsearch {

	public static void main(String[] args) {
		int values[]= {18,89,78,56,12,34,28,31}; 
		int result=linearSearch(values,28);
		if(result==-1)
		{
			System.out.println("The number serached is not in the array");
		}
		else
		{
		System.out.println("The index of the value is the given array is " +result);
		}

	}
	public static int linearSearch(int arr[],int number)
	{
		int n= arr.length;
		int result=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]== number)
			{
				result =i;
				break;
			}
		}
		return result;
		
	}

}
