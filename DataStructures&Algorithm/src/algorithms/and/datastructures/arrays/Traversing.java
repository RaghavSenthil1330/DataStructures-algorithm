package algorithms.and.datastructures.arrays;

public class Traversing {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int arr2[]=new int[6];
		int count=2;
		for(int i=0;i<5;i++)
		{
			arr[i]=count;
			arr2[i]=arr[i];
			System.out.println(arr[i]);		
			System.out.println(arr2[i]);
			System.out.println("___________________________");
			count+=2;
		}
		//System.out.println(arr[5]);
		//System.out.println("_________");
		//System.out.println(count);
		arr2[5]=count;
		// Adding the element at last
		arr=arr2;
		System.out.println(arr[5]);
	

	}

}
