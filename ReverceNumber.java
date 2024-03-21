package sept2023to200;

import java.util.Scanner;

public class ReverceNumber 
{
	public static void main(String []args)
	{
	int num1, rev=0;
	int rem;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	num1=num;
	while(num1>0)
	{
		rem=num1%10;
		rev=(rev*10)+rem;
		num1=num1/10;
		
	}
	 System.out.println("Reverce of Number=" + rev);
	}

}
