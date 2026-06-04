package telsuko.prac;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string you want to reverse");
		String str=s.nextLine();
		String r=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			 r+=str.charAt(i);
		}
		System.out.println(r);
		
	}

}
