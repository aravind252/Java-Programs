public class feboncci{
public static void main(String args[]){

int a=0,b=1,c;
System.out.println("feboncci series: " +a+" "+b+" ");
for (int i=1;i<=15;i++)
	{
c=a+b;
System.out.println(c+" ");
a=b;
b=c;
}
}
}