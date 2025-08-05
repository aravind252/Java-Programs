package progs;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num = sc.nextInt();  // accept the int given  by the user
	

	//now reverse the number
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println("Reversed Number is:"+rev);
	}

}
