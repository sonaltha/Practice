package telsuko.prac;

import java.util.Scanner;

public class DivideByZeroException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to number you want to divide");
		int num1=s.nextInt();
		
		System.out.println("Enter the value to number you want to divide by");
		int num2=s.nextInt();
		
		
		int[]arr= {1,2,3,4,5};
		System.out.println("Enter the index of an array you wan to access");
		int arrr=s.nextInt();
		System.out.println("Value of index " +arrr+ " is " + arr[arrr]);
		
		try {
			int result=num1/num2;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Cannot divide by zero " +e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of index value "+e);
			
		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
		finally {
			System.out.println(" it is okk");
		}
		

	}

}
