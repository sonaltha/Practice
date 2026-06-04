package telsuko.prac;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.nextLine();
		
		str=str.toLowerCase();
		
		int vowels=0;
		int constants=0;
		
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch >='a' && ch<='z') {
				if(ch== 'a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u' ) {
					vowels++;
				}
				else {
					constants++;
				}
			}
		}
		System.out.println("Vowels are " +vowels);
		System.out.println("Constants are "+constants);

	}

}
