package CodeVita.GameOfPrimes;

import java.util.Scanner;

public class GameOfPrimes {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
	try{
		System.out.println("Enter Lower Limit");
		int x=scanner.nextInt();
		System.out.println("Enter Upper Limit");
		int y=scanner.nextInt();
		System.out.println("Enter N(nth element in the series)");
		int n=scanner.nextInt();
		int cnt=0;
		
		for (int i = x; i <= y; i++) {
			if(i>9)
			if(isThisOne(i))
			{
				System.out.println(i);
				cnt++;
				if(cnt==n)
				{
				System.out.println("Element is "+i);	
				break;
				}
			}
		}
		if(cnt<n)
		{
			System.out.println("Nth element in series is not present");
		}
	}catch(Exception exception)
	{
		System.out.println("Invalid Input");
	}
	}
	private static boolean isThisOne(int i) {
		int arr[]=intTOarr(i);
		int sum=0;
		for (int j = 0; j < arr.length; j++) {
			sum+=Math.pow(arr[j],2);
		}
		if(sum==1)
		{
			return true;
		}
		else if(sum>9)
		{
			 return isThisOne(sum);
		}
		else 
		return false;
	}
	private static int[] intTOarr(int i) {
		int temp=i,cnt=0;
		while(temp>0)
		{
			cnt++;
			temp/=10;
		}
		int arr[]=new int[cnt];
		cnt=0;
		while(i>0)
		{
		arr[cnt]=i%10;
		cnt++;
		i/=10;
		}
		
		
		return arr;
	}
}
