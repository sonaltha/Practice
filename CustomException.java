package telsuko.prac;

import java.util.Scanner;

class newException extends Exception{
	public newException(String string) {
		super(string);
	}


}
public class CustomException {
	public static void validateage(int age) throws newException {
		if(age<18) {
			throw new newException("Access denied ");
		}
		else {
			System.out.println("Acces granted");
		}
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int userage=s.nextInt();
		
		try {
			validateage(userage);
		}catch (newException e) {
			// TODO: handle exception
			System.out.println("NOT APPORIATE AGE+ "+e);
		}
	}

	
}
