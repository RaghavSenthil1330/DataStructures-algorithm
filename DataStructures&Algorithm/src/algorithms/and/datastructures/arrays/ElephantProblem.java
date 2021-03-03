package algorithms.and.datastructures.arrays;

import java.util.Scanner;

public class ElephantProblem {
	public static void main(String args[]) {
		
		
//		int arr1[]= {3,7};
//		int fullfill1[]= {4,2,2};
//		int arr2[]= {2,2};
//		int fullfill2[]= {1,1};
		 result();
	}
	public static void result()
	{
		System.out.println("Enter the number of testcase\n");
		Scanner sc = new Scanner(System.in);
		int testcase =sc.nextInt();
		int arr[]=new int[testcase] ;
		
		
		for(int i=0;i<testcase;i++)
		{
			int count=0;
			System.out.println("Enter the elephant and chocolate\n");
			arr[0]=sc.nextInt();
			arr[1]=sc.nextInt();
			System.out.println("enter the cholate to satisfy for each element\n");
			int happyFullfill[]=new int[arr[0]];
			while(count<arr[0])
			{
				happyFullfill[count]=sc.nextInt();
				count++;
			}
			count=0;
			while(arr[0]>0)
			{
				arr[1]=arr[1]-happyFullfill[count];
				count++;
				arr[0]--;
			}
			if(arr[1]>=0)
			{
				System.out.println("Satisfied");
			}
			else
			{
				System.out.println("NOT satisfied");
			}
			
		}
	}
}
