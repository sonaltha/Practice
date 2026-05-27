package telsuko.prac;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want to do factorial: ");
		int num=s.nextInt();
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of " +num+" is " +factorial  );
	}

}
