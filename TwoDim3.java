import java.util.*;

public class TwoDim3
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int arr[][] = new int[3][3];
	int sum = 0;


      System.out.println("*** enter elements of 2d array ***");

      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<3;j++)
         {
            System.out.print("enter 9 elements ");
            arr[i][j] = sc.nextInt();
         }
      }

      System.out.println("***** elements of 2d array in matrix form *****");

      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<3;j++)
         {
	  
	  sum = sum+arr[i][j];      
       }
      }
       System.out.println(sum);

   }
}