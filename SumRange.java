package progs;

import java.util.Scanner;

public class SumRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the minimum num");
		int min=sc.nextInt();
		
		System.out.println("enter the maxmium num");
		int max=sc.nextInt();
		
		int sum=0;
		
		
		for(int i=min;i<=max;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		
		System.out.println("sum of even number between "+min+" to "+max+" is: "+sum);

	}

}
