import java.util.*;

public class Amstrongno{
 public static void main(String args[]){
   
   int num,r,sum=0,orgno;
   System.out.println("Enter the number");
   Scanner sc = new Scanner(System.in);
   num=sc.nextInt();
   
   orgno=num;

   while(num>0){
	r=num%10;
	num=num/10;
	sum=sum+r*r*r;
  }
  if (orgno==sum){
	System.out.println(orgno+" is Amstrong Number");
} else
System.out.println(orgno+" is not Amstrong Number");
}
}
   