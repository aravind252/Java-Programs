import java.util.*;
public class Alphabet{
public static void main(String args[]){

char ch;
System.out.println("Enter the character");
Scanner sc= new Scanner(System.in);
ch = sc.next().charAt(0);
if ((ch>='a' && ch <='z') || (ch>='A' && ch<='Z')){
System.out.println(ch+" is an Alphabet");
}
else
	 System.out.println(ch+" is not an Alphabet");

}
}