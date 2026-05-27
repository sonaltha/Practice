package telsuko.prac;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int reverse(int num) {
		int rev=0;
		int rem;
		
		while (num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
		}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int num=sc.nextInt();
		System.out.println("Reversse number is " + reverse(num));

	}

}
