package progs;

import java.util.Scanner;

public class reverselongnum {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number:");
		    long num = sc.nextLong();  // accept the int given  by the user 
		    
		    // sc.nextLong(); for long number
			

			//now reverse the number
			long rev=0;
			while(num!=0) {
				rev=rev*10+num%10;
				num=num/10;
			}
			System.out.println("Reversed Number is:"+rev);
			}

		

	}


