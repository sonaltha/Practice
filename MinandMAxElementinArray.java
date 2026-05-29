package telsuko.prac;

import java.util.Scanner;

public class MinandMAxElementinArray {
	public static void main(String[]args) {
		///int arr[]= {2,3,8,9,10,4};
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int [] arr=new int [n];
		System.out.println("Enter the element in a array ");
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i]; 
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum element is " +max);
		System.out.println("Minimum element is "+min);
		
	}

}
