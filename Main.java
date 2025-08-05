package progs;

class Account{
	
	private String AccountHolder;
	private double balance;
	
	public  String getAh() {
		return AccountHolder;
	}
	
	public void SetAh(String accountholder) {
		this.AccountHolder=accountholder;
		
	}

}
   public class Main{
	public static void main(String[] args) {
		Account acc= new Account();
		acc.SetAh("Aravind Valaboju");
		
		System.out.println("Account holder: "+acc.getAh());

	}

	}
   