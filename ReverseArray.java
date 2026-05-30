package telsuko.prac;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int ss=s.nextInt() ;
	
	int[]a=new int[ss];
	
	System.out.println("enter the elememts of an array");
	int n=a.length;
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	
	for(int i=n-1;i>=0;i--) {
		System.out.print(a[i]+ " ");
	}

	}

}
