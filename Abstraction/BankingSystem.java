package Abstraction;

public class BankingSystem {

	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount("74627817", "Keerthi", 40000);
		CheckingAccount c=new CheckingAccount("74627819", "Aruna", 70000);
		System.out.println("Savind account details:\n");
		System.out.println(s.getAccountHolderName());
		System.out.println(s.getAccountNumber());
		System.out.println(s.getBalance());
		s.deposite(1000);
		s.withdraw(20000);//amount less than balance
		s.withdraw(35000);//amount greater than balance
		System.out.println();
		
		System.out.println("Checking account details:\n");
		System.out.println(c.getAccountHolderName());
		System.out.println(c.getAccountNumber());
		System.out.println(c.getBalance());
		c.deposite(1000);
		c.withdraw(20000);//amount below over draft limit
		c.withdraw(35000);//amount above over draft limit
		System.out.println();
		
		
		
	}

}
