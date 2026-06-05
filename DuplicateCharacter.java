package telsuko.prac;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sd.nextLine();
		
		int[]frequencu=new int[256];
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			frequencu[ch]++;
		}
		System.out.println("------------------Duplicate Characters------------");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(frequencu[ch]>1) {
				System.out.println(ch+ " : " +frequencu[ch]);
				frequencu[ch]=0;
			}
			
			}
		}
	}


