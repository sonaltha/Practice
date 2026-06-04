package telsuko.prac;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String to PAlindrome");
		String og=s.nextLine();
		
		String clean=og.replaceAll("\\s+","").toLowerCase();
		
		String reverse="";
		
		for(int i=clean.length()-1;i>=0;i--) {
			reverse+=clean.charAt(i);
		}
		if(clean.equals(reverse)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}

	}

}
