package telsuko.prac;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter thr you with space ");
		String str=s.nextLine();
		
		String trimmed=str.replaceAll("\\s+", "");
		
		System.out.println(trimmed);

	}

}
