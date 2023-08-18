package Abstraction;

public class CheckingAccount extends BankAccount{
	protected double overDraftLimit=30000;
	public CheckingAccount(String accountNumber, String accountHolderName, double balance) {
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
		if (amount > 0 && amount<=overDraftLimit) {
            super.balance -= amount;
            System.out.println("Withdrawn sucessful."+"\n"+"Withdrawal amount is: " + amount);
        } else {
            System.out.println("Withdrawal not allowed. Please withdraw amount under the over-draft-limit.");
        }
	}

}
