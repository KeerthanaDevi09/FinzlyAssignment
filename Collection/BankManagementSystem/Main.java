package Collection.bankAcc;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<BankAccount> hs=new HashSet<>();
		while(true) {
			System.out.println("Bank Details \n 1.Crete Account \n 2. Deposite Amount \n 3. Withdraw amount \n 4. Check Balance \n 5.View accounts \n 6.exit \n");
			System.out.println("Enter a choice: ");
			int option=sc.nextInt();
			sc.nextLine();
			if(option==1)
			{
				System.out.println("Enter Account Holder Name: ");
				String accountHolder=sc.nextLine();
				int accountNumber=hs.size()+1;
				BankAccount b=new BankAccount(accountNumber,accountHolder);
				hs.add(b);
				System.out.println("Account Created Successfully");
			}
			else if(option==2)
			{
				System.out.println("Enter Account Number: ");
				int depositeAccNo=sc.nextInt();
				System.out.println("Enter the amount to be deposite :");
				double amount=sc.nextDouble();
				for(BankAccount bank:hs)
				{
					if(bank.getAccoutNumber()==depositeAccNo)
					{
						bank.deposite(amount);
					}
				}
			}
			else if(option==3)
			{
				System.out.println("Enter Account Number: ");
				int withdrawAccNo=sc.nextInt();
				System.out.println("Enter the amount to be withdraw :");
				double amount=sc.nextDouble();
				for(BankAccount bank:hs)
				{
					if(bank.getAccoutNumber()==withdrawAccNo)
					{
						bank.withdraw(amount);
					}
				}
			}
			else if(option==4)
			{
				System.out.println("Enter Account Number: ");
				int balanceAccNo=sc.nextInt();
				for(BankAccount bank:hs)
				{
					if(bank.getAccoutNumber()==balanceAccNo)
					{
						System.out.println("Balance amount: "+ bank.getBalance());
					}
				}
			}
			else if(option==5)
			{
				System.out.println("View Account Details");
				
				System.out.println(hs.toString());
			}
			else if(option==6)
			{
				System.out.println("Exit");
				sc.close();
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid option. Please Enter a valid option");
			}
			
		}
		

	}

}
