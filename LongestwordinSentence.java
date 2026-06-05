package telsuko.prac;

import java.util.Scanner;

public class LongestwordinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string1 :");
		String str1 = s.nextLine();
		
		String[]words=str1.split("\\s");
		String longest=" ";
		
		for(String word: words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
			
		}
		System.out.println("Longest word= "+longest );

	}

}
