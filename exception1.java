import java.util.*;
public class exception1{
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	
	try{
		System.out.println("ENTER THE NUMBER DIVIDE 100: ");
		int num= sc.nextInt();
		
		int result= num/100;
		System.out.println("Result: "+result);

	}catch(ArithmeticException e){
	  System.out.println("Error: cannot divided with zero");
	}catch(Exception e){
	  System.out.println("something went wrong"+e.getMessage());
	}finally{
	 System.out.println("program finished(finlly block executed)");
	}
}
}
