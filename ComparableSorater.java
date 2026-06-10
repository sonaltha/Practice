package telsuko.prac;

import java.util.ArrayList;
import java.util.Collections;

class Dance implements Comparable{
	public  String DanceStyle;
	public int year;
	
	
	public Dance(String danceStyle, int year) {
		super();
		DanceStyle = danceStyle;
		this.year = year;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Dance other=(Dance)o;
		if(year>other.year) {
			return 1;
		}
		if(year<other.year) {
			return -1;
		}
		return 0;
	}
	
}
public class ComparableSorater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dance>d=new ArrayList<Dance>();
		d.add(new Dance("salsa ", 1969));
		d.add(new Dance("hip hop",2000));
		d.add(new Dance("Kathak", 1500));
		
		Collections.sort(d);
		
		for(Dance d1:d ) {
			System.out.println(d1.DanceStyle+ " "+ d1.year);
		}

	}

}
