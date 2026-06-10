package telsuko.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car{
	public String brand;
	public String model;
	public int year;
	
	public Car(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
}
class Compare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Car a=(Car)o1;
		Car b=(Car)o2;
		
		if(a.year>b.year) {
			//System.out.println("it launched before");
			return 1;
		}
		if(a.year<b.year) {
			//System.out.println("It is launched after");
			return -1;
		}
		
		return 0;
	}}
public class ComparatorSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Car>Cars=new ArrayList<Car>();
		Cars.add(new Car("TATA ", " Nan0", 2001));
		Cars.add(new Car("BMW","X5", 2005));
		Cars.add(new Car("MAhinadra", "Scoprio",1999));
		
		Comparator com=new Compare();
		Collections.sort(Cars,com);
		
		
		for(Car c:Cars ) {
			System.out.println("Brand: "+ c.brand+ " Model: " +c.model + " YEar: "+c.year );
		}
	}

}
