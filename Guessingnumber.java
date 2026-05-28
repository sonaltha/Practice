package telsuko.prac;

import java.util.Scanner;

public class Guessingnumber {

	public static void guessingnum() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=1+(int)(Math.random()*100);
		
		int attempts=6;
		
		System.out.println("A number is chosen between 1 and 100");
		
		System.out.println(" You have "+attempts +" attempt");
		
		for(int i=1;i<attempts;i++) {
			System.out.println("Enter your guess.");
			int guess=s.nextInt();
			
			if(guess==num) {
				System.out.println("You have correctly guess the number");
				return;
			}
			else if(guess>num){
				System.out.println("Your number is greater then guessing number");
			}
			else  {
				System.out.println("your number is smaller");
			}
		}
		System.out.println("You run out of attempt the number was " +num);

	}
	public static void main(String[]args) {
		guessingnum();
	}

}
