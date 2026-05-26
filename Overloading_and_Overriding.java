package telsuko.prac;

import java.util.Scanner;

class Formula1{
	
//Method Overloading
	
	public void  prix(String Country) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Which Grand PRix do you like: ");
		String count=scan.nextLine();
		
		switch(count) {
		case "Monaco Grand Prix":
			System.out.println("oo u like to be richest Country,'It means u r Rich'");
			break;
		
		case "British Grand Prix":
			System.out.println("It is oldest grand prix of f1");
			break;
			
		case "Italian Grand Prix": 
			System.out.println(" The Temple of Speed holding the record for the fastest race in F1 history");
			break;
			
			default:
				System.out.println(" Onlt this much info i can provide ");
		}
	}
		public void prix(String Country,String location) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Which Grand PRix do you like: ");
			String count=scan.nextLine();
			
			if(count.equals("Monaco Grand Prix")) {
				System.out.println("OO u like Monaco");
			}
			else if(count.equals("British Grand Prix")) {
				System.out.println("you like silverstone");
			}
			else if(count.equals("Italian Grand Prix")) {
				System.out.println("OO u like speed");
			}
			else {
				System.out.println("Tell us your favorite so we can add your favourite in this ");
			}
			
		}		
	}
class Drivers extends Formula1{
	public void prix(String country) {
		System.out.println("Hi you like to watch prix");
	}
	
	public void drive(String Driver) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which Driver do you like: ");
		String driv=scan.nextLine();
		
		switch(driv) {
		case "Michael Schumacher":
			System.out.println("OOU fan of 7th time world champiom");
			break;
		
		case "Lando Norris":
			System.out.println("LANDO the current f1 champion");
			break;
			
		case "Carlos Sainz JR": 
			System.out.println("You mean it to say smooth operation");
			break;
			
		case "Charles Leclerc": 
			System.out.println("Leclerc Leclercccccccc");
			break;
			
			
		case "Max Verstappen": 
			System.out.println("DU DU Max Verstappen");
			break;
			
			
			default:
				System.out.println(" Onlt this much info i can provide ");
		}
	}
}
public class Overloading_and_Overriding {
	
	public static void main(String[]args) {
	
		Formula1 f1=new Formula1();
		f1.prix("india","jaipur");
		Drivers f2=new Drivers();
		f2.drive("Hi");
	}
}
