package telsuko.prac;

import java.util.Scanner;

public class GCDofTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		int gcd=1;
		for(int i=1;i<=num1 && i<=num2;++i) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}System.out.println("GCD of " +num1+ " and " +num2+ " is " +gcd);

	}

}
