package telsuko;

public class BankAccount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b=new BankAccount(123459786,"ABCD",50);
		
		System.out.println(b.getAccountHolder());
		System.out.println(b.getBalance());
		System.out.println("----------------------------------------------------------------");
        b.deposit(200.00);
        System.out.println(b.getBalance());
		System.out.println("----------------------------------------------------------------");
		b.withdraw(100);
		System.out.println(b.getBalance());
		b.withdraw(500);
		System.out.println(b.getBalance());

	}

}
