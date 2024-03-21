package sept2023to200;

import java.util.Arrays;
import java.util.Scanner;

public class arryaSort 
{
	public static void main(String []args)
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data Arrays");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+ "...> All Sorted Arrays");
		}
		
	}

}
