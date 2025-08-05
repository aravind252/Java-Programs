package progs;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeRange {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the minimum num");
		int min=sc.nextInt();
		
		System.out.println("enter the maxmium num");
		int max=sc.nextInt();
		
		System.out.println("Prime numbers between "+min+ "to"+max+"are:");
		
		for (int num=min; num<=max;num++) {
			int count=0;
			
			for (int i=1;i<=num;i++) {
				if (num%i==0) {
					count++;
				}
			}
			if (count==2) {
				System.out.println(num+" ");
			}
		}
		
	}
}
