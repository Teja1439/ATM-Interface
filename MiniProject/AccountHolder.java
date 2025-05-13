package MiniProject;

public class AccountHolder {
	private  String userid;
	private String userpin;
	

	public AccountHolder(String userid, String userpin) {
		this.userid=userid;
		this.userpin=userpin;
	}


	public String getUserid() {
		return userid;
	}
	public String getUserpin() {
		return userpin;
	}
	
	public boolean validPin(String pin) {
		return this.userpin.equals(pin);
	}

}





