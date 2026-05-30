package telsuko.prac;

import java.util.Scanner;

public class Sortarraywithout_using_inbuilt_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int s=sd.nextInt();
		
		int arr[]=new int[s];
		
		System.out.println("Enter the element of array");
		for(int i=0;i<s;i++) {
			arr[i]=sd.nextInt();
		}
		//bubble sort
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				} //System.out.print(j+ " ");
			}
	}
			System.out.println("Sorted array " );
			for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ "  ");}
		}
		

	}


