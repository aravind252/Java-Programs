import java.util.*;
public class Secondhighest{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of  elements");
		int size = sc.nextInt();

		if(size<2){
		System.out.println("Array must contain atleast 2 elements");
		return;
	         }

                int[] numbers = new int[size];  

	         System.out.println("enter" +size+ "elements");
			for (int i=0;i<size;i++){
				numbers[i]=sc.nextInt();
				}
 

		int first =Integer.MIN_VALUE;
		int second =Integer.MIN_VALUE;
		
		for(int num:numbers){
			if(num>first){
				second=first;
				first=num;						
				}else if(num>second &&num!=first){
					second = num;
					}
			}
			if (second==Integer.MIN_VALUE){
				System.out.println("there no highest no");
			}else {
				System.out.println("second highest:"+second);
				}

	}
}