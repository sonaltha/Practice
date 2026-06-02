package telsuko.prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Count_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a=s.nextInt();
		
		int []arr=new int[a];
		System.out.println("Enter the element of an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		Map<Integer,Integer>elementCountMap=new HashMap<Integer, Integer>();
		
		for(int element: arr)
		{
			elementCountMap.put(element, elementCountMap.getOrDefault(element, 0)+1);
		}

		for(Map.Entry<Integer, Integer>entry: elementCountMap.entrySet()) {
			System.out.println("Element: "+entry.getKey() +" FRequency: "+entry.getValue());
		}
	}

}
