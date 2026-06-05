package telsuko.prac;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string1 :");
		String str1 = s.nextLine();
		
		System.out.println("Enter the string 2 :");
		String str2= s.nextLine();

		if(str1.compareTo(str2)==0) {
			System.out.println("String are eqyal");
		}
		else {
			System.out.println("String are not equal");
		}

	}

}
