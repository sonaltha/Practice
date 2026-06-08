package telsuko.prac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>aero=new ArrayList<String>();
		aero.add("Pineapple");
		aero.add("Lotus");
		aero.add("Apple");
		aero.add("water");
		
		System.out.println("---------------Before Sorting-----------------");
		System.out.println(aero);
		System.out.println();
		
		System.out.println("---------------Sorting in a Ascending order---------------");
		Collections.sort(aero);
		System.out.println(aero);
		System.out.println();
		
		System.out.println("---------------Sorting in a Descending order---------------");
		Collections.sort(aero,Collections.reverseOrder());
		System.out.println(aero);

	}

}
