package Abstraction;

public class SavingsAccount extends BankAccount{
	protected double interestRate;
	

	public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
		}

	@Override
	public void deposite(double amount) {
		if(amount>0)
		{
			super.balance+=amount;
			System.out.println("Amount deposited sucessfully.");
			System.out.println("Balance amount after deposite: "+super.balance);
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount > 0 && amount < super.balance)
			{
				super.balance-=amount;
				System.out.println("Withdrawal sucessful.");
				System.out.println("Balance amount after withdraw: "+ super.balance);
			}
		else
		{
			System.out.println("Withdrawal not done. Insufficent Balance");
		}
	}

}
