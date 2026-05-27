package telsuko.prac;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		
		int first=0, second=1;

		System.out.println("Fibonacci series:  ");
		
		for(int i=1;i<=num;i++) {
			System.out.print(first+" ");
			
			int next=first+second;
			first=second;
			second=next;

		}
	}

}
