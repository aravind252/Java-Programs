package progs;

public class PerfectRange {

	public static void main(String[] args) {
		int min=1;
		int max=1000;
		
		for(int num=min;num<=max;num++) {
		  int sum =0;
		  
		  for (int i =1;i<num;i++) {
			  if (num%i==0) {
				  sum = sum+i;
				  
			  }
		  }
		  if(sum==num){
			System.out.println(num+" is a perfect number");  
		  }
		  
		}

	}

}
