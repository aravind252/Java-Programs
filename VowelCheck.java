package progs;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter a character: ");
	 char ch = sc.next().charAt(0);
	 
	 ch=Character.toLowerCase(ch);
	 
	 if (ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
		System.out.println(ch+" is vowel");
	}else if ((ch>='a' &&ch<='z')) {
		System.out.println(ch+ "is consonant.");
		
	}else {
		System.out.println(ch+ "is not an alphabet.");
	}

	}

}
