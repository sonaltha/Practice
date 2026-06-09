package telsuko.prac;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordFrequency_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the sentence you want to count the frequency ");
		String input=s.nextLine();
		
		if(input.isEmpty()) {
			System.out.println("String cannot be empty");
			return;
		}
		
		String[]words=input.split("\\s+");
		HashMap<String, Integer>frequency=new HashMap<>();
		for(String word:words) {
		//	word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			
			if(word.isEmpty()) {
				continue;
			}
			frequency.put(word, frequency.getOrDefault(word, 0)+1);
		}
		
		System.out.println(frequency);
	}

}
