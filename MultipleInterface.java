package telsuko.prac;

interface Dog{
	void Sound(String Sound);
}
interface Cat{
	void Walk(String Walk);
}
interface Eat{
	void Eating(String Eatt);
}
interface Peacock{
	void Singing(String Sing);
}

class Animal implements Dog,Cat,Eat,Peacock{

	@Override
	public void Singing(String Sing) {
		// TODO Auto-generated method stub
		System.out.println("Eaxh animals have different singing style");
		
	}

	@Override
	public void Eating(String Eatt) {
		// TODO Auto-generated method stub
		System.out.println("Every animal have different eating style");
		
	}

	@Override
	public void Walk(String Walk) {
		// TODO Auto-generated method stub
		System.out.println("Every animal walk differently");
		
	}

	@Override
	public void Sound(String Sound) {
		// TODO Auto-generated method stub
		System.out.println("Animal make various sound");
		
	}
	
}
public class MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a=new Animal();
		a.Eating("grass");
		a.Walk("Cat Walk");
		a.Sound("Meow Meow");
		a.Singing("peacock");

	}

}
