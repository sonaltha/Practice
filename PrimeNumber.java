package telsuko.prac;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want check is prime : ");
		int num=s.nextInt();
		
		boolean isPrime=true;
		
		if(num<=1) {
			isPrime=false;
		}else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+ " is not a prime number");
		}
		
		

	}

}
