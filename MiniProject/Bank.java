package MiniProject;

import java.util.HashMap;

public class Bank {
	
	private HashMap<String, AccountHolder> holders;
	private HashMap<String, Account>  accounts;
	
	public Bank(){
		holders = new HashMap<>();
		accounts=new HashMap<>();
		
		addUser("Sai","1234");
		addUser("Hari","4567");
	}
	
	private void addUser(String userid,String userpin) {
		AccountHolder holder=new AccountHolder(userid,userpin);
		Account account=new Account();
		
		holders.put(userid, holder);
		accounts.put(userid, account);
	}

	public AccountHolder getAccountHolder(String userid) {
		return holders.get(userid);
	}
	
	public Account getAccount(String userid) {
		return accounts.get(userid);
	}
	
	public boolean isValidUser(String userid,String userpin) {
		AccountHolder holder=holders.get(userid);
		return holder!=null && holder.validPin(userpin);
		
	}	
}
