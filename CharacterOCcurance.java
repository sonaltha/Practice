package telsuko.prac;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterOCcurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = s.nextLine();

		HashMap<Character, Integer> charmap=new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			if(charmap.containsKey(ch)) {
			charmap.put(ch, charmap.get(ch)+1);
			}
			else {
				charmap.put(ch, 1);
			}
		}
		System.out.println("-----------Characters---------");
		for(char ch:charmap.keySet()) {
			System.out.println(ch+ " : " +charmap.get(ch));
		}
	}

}
