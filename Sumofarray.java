import java.util.*;

public class Sumofarray{

public static void main(String args[]){
 	
 	Scanner sc = new Scanner(System.in);
	int arr[][]=new int[2][2];
	int sum = 0;

	System.out.println("****enter the  elements****");

	for( int i=0;i<arr.length;i++)
		{
		   for( int j=0;j<2;j++){
			arr[i][j]=sc.nextInt();
				}
		}

	System.out.println("****sum of the elements****");

	for( int i=0;i<arr.length;i++)
		{
		   for( int j=0;j<2;j++)
		{
			sum= sum+arr[i][j];
		}
		}
System.out.println(sum);
}
}