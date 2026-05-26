package telsuko.prac;

abstract class Hell{
	abstract void telme_talna();
}

class Life extends Hell{

	@Override
	void telme_talna() {
		// TODO Auto-generated method stub
		System.out.println("me kya ladle bure kam kia he ");
	}
	
	
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Life l=new Life();
		l.telme_talna();
	}

}
