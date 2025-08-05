package progs;


	
	class Ak{
		private String aa;
		private double balance;

		public String getAccount(){
		return aa; 
		}

		public void setAccount(String name){
		aa=name;
		}

		}

		public class En{
		public static void main(String args[]){
		Ak s=new Ak();
		s.setAccount("kar");
		System.out.println(s.getAccount());
		}
		}


