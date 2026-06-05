package telsuko.prac;

import java.util.Scanner;

public class Convertfirstlettertouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = s.nextLine();

		String[]words=str.split("\\s+");
		String result="";
		
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			
			if(word.length()>0) {
				char firstchar=Character.toUpperCase(word.charAt(0));
				String restOFword=word.substring(1);
				result+=firstchar+restOFword+ " ";
			}
		}
		System.out.println(result.trim());

	}

}
