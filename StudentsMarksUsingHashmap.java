package telsuko.prac;

import java.util.HashMap;
import java.util.Scanner;

public class StudentsMarksUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		HashMap<String, Integer>studentsRecord=new HashMap<>();
		
		System.out.println("-------Student REgistry-----------");
		System.out.println("Enter the details.Type 'stop' when you want to finish ");
		
		while(true) {
			System.out.println("enter the name");
			String name=s.nextLine();
			
			
			if(name.equalsIgnoreCase("stop")) {
				break;
			}
			if(name.isEmpty()) {
				System.out.println("Name Cannot be empty");
				continue;
			}
			
			System.out.println("Enter Marks for "+ name+ " :" );
			int marks=s.nextInt();
			s.nextLine();
			
			studentsRecord.put(name, marks);
			System.out.println("Recorded successfully");
			
			
		}
		
		System.out.println("-----Record of All Students----");
		System.out.println(studentsRecord);
		
		System.out.println("Enter the name you want to search");
		String searchName=s.nextLine().trim();
		
		if(studentsRecord.containsKey(searchName)) {
			int score=studentsRecord.get(searchName);
			System.out.println("Result: "+ searchName+ " scored "+score+ " marks");
		}
		else {
			System.out.println("Error: student not found");
		}
		

	}

}
