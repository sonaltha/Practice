package telsuko.prac;

interface Payment{
	 void pay(double amount);
}
class CreditCard implements Payment{
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " is successfully paid through Credit Card");
	}
}
class UPI implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" is successfully paid thorugh UPI");
	}
	
}

public class InrerfaceDemo {

	public  static void main (String[]args) {
		
		CreditCard c= new CreditCard();
		c.pay(650);
		UPI u=new UPI();
		u.pay(300);
		
	}
}
