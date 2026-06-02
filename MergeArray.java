package telsuko.prac;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array in one");
		int a1=s.nextInt();
		System.out.println("Enter the size of second array");
		int a2=s.nextInt();
		
		System.out.println("Enter the element of array one");

		int arr1[]=new int[a1];

		int arr2[]=new int[a2];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter the element of array 2");

		for(int i=0;i<arr2.length;i++) {
			arr2[i]=s.nextInt();
		}
		/*
		int []arr1= {1,3,4};
		
		int[]arr2= {2,4,5};*/
		
		int []mergedArray=new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
		
		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
		
		System.out.println(Arrays.toString(mergedArray));
		
		
	}

}
