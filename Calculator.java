package telsuko;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("+ ,-, *, /");
		char operator=sc.next().charAt(0);
		
		System.out.println("Enter the Second number");
		int num2=sc.nextInt();
		
		
		
		int result=0;
		switch(operator){
		
		case '+':
			result=num1+num2;
			break;
			
		case '-':
			result=num1-num2;
			break;
			
		case '*':
			result=num1*num2;
			break;
			
		case '/':
			if(num2==0) {
				System.out.println("Divide by 2 isnot allowed");
			}
			else {
			result=num1/num2;}
			break;
		}
		System.out.println(result);
			
		
		

	}

}
