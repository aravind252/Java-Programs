package progs;

public class Swap {

	public static void main(String[] args) {
		int a =5;
		int b = 7;
		System.out.println("before swaping");
		System.out.println("a= "+a+" b= "+b);
		
		int temp =a;
		a=b;
		b=temp;
		
		System.out.println("after swaping");
		System.out.println("a= "+a+" b= "+b);

	}

}
