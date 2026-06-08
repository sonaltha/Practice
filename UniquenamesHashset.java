package telsuko.prac;

import java.util.HashSet;
import java.util.Scanner;

public class UniquenamesHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		HashSet<String>h=new HashSet<String>();
		
		System.out.println("Enter the name one by one and Type 'exit ' if you want to ");

		while(true) {
			System.out.println("Enter the name");
			String in=s.nextLine();
			
			if(in.equalsIgnoreCase("exit")) {
				break;
			}
			if(in.isEmpty()) {
				System.out.println("name cannot be empty");
				continue;
			}
			
			boolean isAdded=h.add(in);
			
			if(!isAdded) {
				System.out.println(in+ " already in a list");
			}
		}
		System.out.println("-----Final List----------");
		System.out.println(h);
	}

}
