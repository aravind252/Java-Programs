package progs;

import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int s1,s2,s3,s4,s5,total;
		  float avg;
		  
		  System.out.println("Enter marks of 5 subjects:");
		  
		  s1=sc.nextInt();
		  s2=sc.nextInt();
		  s3=sc.nextInt();
		  s4=sc.nextInt();
		  s5=sc.nextInt();
		  
		  total = s1+s2+s3+s4+s5;
		  avg = total/5.0f;
		  
		  System.out.println("Total= "+total);
		  System.err.println("Average= "+avg);
		  
		  if (avg>=90) {
			  System.out.println("GRADE: A+");
		  }else if (avg>=80&& avg<=89) {
			  System.out.println("GRADE: A");
		}else if (avg>=70&& avg<=79) {
			System.out.println("GRADE: B");
		}else if (avg>=60 && avg<=69) {
			System.out.println("GRADE: C");
			
		}else if (avg>=50 && avg<=59) {
			System.out.println("GRADE: d");
		}else {
			System.out.println("Fail");
		}

	}

}
