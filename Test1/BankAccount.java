package Test1;

public class BankAccount {
	private long accountNumber;
	private double balance;
	private String ownerName;
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance>0)
			this.balance = balance;
		else
			System.out.println("Invalid Balance");
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void deposite(double amount)
	{
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposite sucessfull!!!");
		}
		else
			System.out.println("Please enter valid amount");
	}
	public void withdraw(double amount)
	{
		if(amount>0 && balance>amount) {
			balance-=amount;
			System.out.println("Withdrawal sucessfull!!!");
		}
		else
			System.out.println("Please enter valid amount");
	}
	public void checkBalance()
	{
		System.out.println("Your account balance is: "+ balance);
	}
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.setAccountNumber(723523457);
		b.setBalance(5500);
		b.setOwnerName("Keerthi");
		//b.getAccountNumber();
		//b.getBalance();
		//b.getOwnerName();
		b.deposite(1500);
		b.checkBalance();
		b.withdraw(1000);
		b.checkBalance();
	}

}
