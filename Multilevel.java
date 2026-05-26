package telsuko.prac;
class Grandparents{
	public void babyboomer() {
		System.out.println("We produce 7-8 babies");
	}
}
class parents extends Grandparents{
	public void silentgenrations(){
		System.out.println("We produce 2-3 babies");
	}
}
class US extends parents{
	public void GenZ() {
		System.out.println("We don't want to get married");
	}
}
public class Multilevel {
	
	public static void main(String[]args) {
	
		US g=new US();
//	US u=new Grandparents();
	g.babyboomer();
	g.GenZ();
	g.silentgenrations();

	}

}
