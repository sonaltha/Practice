package telsuko.prac;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check is palindrome");
		int ognum=sc.nextInt();
		int temp=ognum;
		int reversedNum=0;
		
		while(temp>0) {
			int last=temp%10;
			reversedNum=(reversedNum*10)+last;
			temp=temp/10;
		}
		if(ognum==reversedNum) {
			System.out.println(ognum+ " is a palindrome number");
		}
		else {
			System.out.println(ognum+ " is not a palindrome number");
		}

	}

}
