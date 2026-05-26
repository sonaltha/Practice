package telsuko.prac;

class Student{
	String name;
	int age;
	int rollno;
	
	public Student(int rollno) {
		this.rollno=26;
	}
	public Student(String name, int age) {
		super();
		this.name = "ABCB";
		this.age = 25;
	}
	
	
}



public class Constructor_overloading {

	public static void main(String[]args) {
		Student s=new Student("ABCD",25);
		System.out.println("Name:"+ s.name);
		System.out.println("age: "+s.age);
	}
}
