package telsuko.prac;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int ognum=num;
		
		int armstrong=0;
		
		while(num>0) {
			int digit=num%10;
		    armstrong=armstrong+ (digit*digit*digit);
			num=num/10;
		}
		
		if(armstrong==ognum) {
			System.out.println(ognum +" is a armstrong number");
		}
		else {
			System.out.println(ognum +" is not armstrong number");
		}
		

	}

}
