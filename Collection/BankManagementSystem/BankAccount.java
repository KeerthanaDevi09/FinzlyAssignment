package Collection.bankAcc;

public class BankAccount {
	private int accoutNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accoutNumber, String accountHolderName) {
		this.accoutNumber = accoutNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
	}

	public int getAccoutNumber() {
		return accoutNumber;
	}

	public void setAccoutNumber(int accoutNumber) {
		this.accoutNumber = accoutNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accoutNumber=" + accoutNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}

	public void deposite(double amount) {
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Amount deposited successfully.");
		}
		else
		{
			System.out.println("Invalid amount");
		}
		
	}

	public void withdraw(double amount) {
		if(amount>0 && amount<balance)
		{
			balance-=amount;
			System.out.println("Amount withdraw successfully");
		}
		else
		{
			System.out.println("Invalid amount or Insufficient balance");
		}
		
	}
	
	
	

}
