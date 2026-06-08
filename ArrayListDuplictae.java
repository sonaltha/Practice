package telsuko.prac;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDuplictae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		ArrayList<String>a=new ArrayList<>();
		System.out.println("How many lement you want to add it in a list");
		int count=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the " +count+ " items");
		for(int i=0;i<count;i++) {
			a.add(s.nextLine().trim());
		}
		
		System.out.println("Original list" +a);
		
		for(int i=0;i<a.size();i++) {
			for(int j=i+1;j<a.size();j++) {
				if(a.get(i).equalsIgnoreCase(a.get(j))) {
					a.remove(j);
					j--;
				}
			}
			//System.out.println("List after removing duplicate "+a  );
		}			System.out.println("List after removing duplicate "+a  );

		
		

	}

}
