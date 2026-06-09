package telsuko.prac;

import java.util.HashSet;
import java.util.Scanner;

public class Common_between_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		HashSet<String>set1=new HashSet<String>();
		HashSet<String>set2=new HashSet<String>();
		
		System.out.println("Enter items for the first set , if you want to finish type 'done' ");
		while(true) {
			String input =s.nextLine();
			if(input.equalsIgnoreCase("done")) {
				break;
			}
			if(!input.isEmpty()) {
				set1.add(input);
			}
		}
		System.out.println("Enter items for the second set, if you want to finish  type 'done'");
		while(true) {
			String input=s.nextLine();
			if(input.equalsIgnoreCase("done")) {
				break;
			}
			if(!input.isEmpty()) {
				set2.add(input);
			}
			
		}
		
		System.out.println("\nGroup 1 Elements: "+set1);
		System.out.println("Group2 elements: "+set2);
		
		HashSet<String>commonElements=new HashSet<>(set1);
		
		commonElements.retainAll(set2);
		
		System.out.println("---------Common Elements------------");
		
		if(commonElements.isEmpty()) {
			System.out.println("No common element found");
		}
		else {
			System.out.println(commonElements);
		}
			
			
		}
		
	}


