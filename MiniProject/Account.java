package MiniProject;

import java.util.ArrayList;

public class Account {
	
	private double balance;
	private ArrayList<String> transactionhistory;
	
	public Account() {
		this.balance=0.0;
		this.transactionhistory=new ArrayList<>();		
	}
	
	public void deposite(double amount) {
		balance+=amount;
		System.out.println("Transaction successfull.....");
		transactionhistory.add("Amount "+amount+" deposited");
	}
	
	public boolean withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Transaction successfull.....");
			transactionhistory.add("Amount "+amount+" withdraw");
			return true;
		}
		return false;
	}
	
	public boolean transfer(Account toaccount, double amount) {
		if(withdraw(amount)) {
			toaccount.deposite(amount);
			transactionhistory.add("Amount "+amount+" deposited to account "+toaccount);
			return true;
		}
		return false;
	}
	
	public void transactionhistory() {
		if(transactionhistory.isEmpty()) {
			System.out.println("Empty");
		}else {
			for(String records:transactionhistory) {
				System.out.println(records);
			}
		}
	}

	public double getBalance() {
		return balance;
	}	
 
}
