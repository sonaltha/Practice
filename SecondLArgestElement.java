package telsuko.prac;

import java.util.Scanner;

public class SecondLArgestElement {

	static int secondlargest(int[]a) {
		int max1=0,max2=0;
		if(a[0]>a[1]) {
			max1=a[0];
			max2=a[1];
		}
		else {
			max1=a[1];
			max2=a[0];
		}
		
		for(int i=2;i<a.length;i++) {
			if(a[i]>max1) {
			max2=max1;
			max1=a[i];
		}
		else if(a[i]>max2) {
			max2=a[i];
		}
			
		}
		return max2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int sc=s.nextInt();
		
		int []ar=new int[sc];
		
		System.out.println("Enter the element for array");
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=s.nextInt();
		}
		System.out.println(secondlargest(ar));
		

	}

}
