package telsuko.prac;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string1 :");
		String str1 = s.nextLine();
		
		System.out.println("Enter the string 2 :");
		String str2= s.nextLine();

		String cleanstr1=str1.replaceAll("\\s+","" ).toLowerCase();
		String cleanstr2=str2.replaceAll("\\s+", "").toLowerCase();
		
		boolean isAnagram=true;
		
		if(cleanstr1.length()!=cleanstr2.length()) {
			isAnagram= false;
		}
		else {
			char[]arr1=cleanstr1.toCharArray();
			char[]arr2=cleanstr2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			isAnagram=Arrays.equals(arr1, arr2);
		}
		
		if(isAnagram) {
			System.out.println(str1+ " & " +str2+ " is a Anagram");
		}
		else {
			System.out.println(str1+ " & " +str2+ " is not a Anagram");
		}
		

	}

}
