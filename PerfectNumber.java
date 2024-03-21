package sept2023to200;

import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String []args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int num=sc.nextInt();
		for( int i=1; i<num; i++)
		{
			sum=sum+i;
		}
		if(sum==num)
		{
			System.out.print("perfect number" +sum);
		}
		else 
		{
			System.out.println("its not perfect number");
			
		}
	}

}
