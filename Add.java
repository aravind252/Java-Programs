package progs;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  a and b values");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		c =a+b;
		System.out.println(c+" ");

	}

}
