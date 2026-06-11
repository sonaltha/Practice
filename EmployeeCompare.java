package telsuko.prac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Employee implements Comparable{
	
	public String name;
	public int id;
	public int Salary;
	
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		Salary = salary;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee other=(Employee)o;
		if(Salary<other.Salary)
			return 1;
		if(Salary>other.Salary)
			return -1;
		return 0;
	}
	
}
public class EmployeeCompare {

	public static void main(String[] args) {
		
		ArrayList<Employee>e= new ArrayList<Employee>();
		e.add(new Employee("Sonali", 101, 80000));
		e.add(new Employee("Archana ", 103, 1000000));
		e.add(new Employee("Shraddha", 102, 91000));
		e.add(new Employee("Harsha",100,85000));
		
		Collections.sort(e);
		
		for( Employee emp: e) {
			System.out.println("Salary: "+ emp.Salary+ " ID:  " + emp.id+ " Name: "+emp.name );
		}
		
	}

}
