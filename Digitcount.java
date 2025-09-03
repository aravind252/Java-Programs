import java.util.*;
public class Digitcount{
public static void main(String args[]){

int num,count=0;
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
num=sc.nextInt();

while (num!=0){
num=num/10;
count++;
}
System.out.println("Count the number: "+count);

}


}
