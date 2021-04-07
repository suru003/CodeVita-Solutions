package CodeVita.LargestInteger;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class LargestInteger {
static Scanner scanner=new Scanner(System.in).useDelimiter("\n");
	public static void main(String[] args) 
	{
		int mn[]=tokenize(scanner.next(),",");
		int m=mn[0];
		int n=mn[1];
		int arr[]=new int[m*n]; 
		int counts[]=new int[m];
		for (int i = 0; i < counts.length; i++) 
		{
			counts[i]=n;
//			System.out.print(counts[i]+" ");
		}
		int cindex=0;
		for (int i = 0; i < m; i++)
		{
		int temp[]=tokenize(scanner.next(),",");
		cindex=i*n;
			
			for (int j = 0; j < temp.length; j++) 
			{
			arr[cindex]=temp[j];	
			cindex++;
			}
		}
//		for (int i = 0; i < arr.length; i++)
//		{
//		System.out.print(arr[i]+" ");	
//		}
		int flag=0;
		int max=0;
		int mset=0;
		int dec=0;
		int result=0;
		while(flag!=1)
		{
			for (int i = 1; i <=m; i++)
			{
				int ms=0;
		
				while(ms<m)
				{
//					System.out.println(arr[n*ms+counts[ms]-1]);
				if(counts[ms]!=0)
				{
					if(max<arr[n*ms+counts[ms]-1])
				{
					max=arr[ms*n+counts[ms]-1];
					mset=ms;
//					System.out.println(ms+" Max "+max);
				}
				}
				ms++;
				}
			}
			result=result*10+max;
			max=0;
			if(counts[mset]>=1)
				counts[mset]-=1;
			
			for (int i = 0; i < counts.length; i++) 
			{
				if(counts[i]!=0)
					break;
				flag=1;
			}
		}
		System.out.println();
		System.out.println(result);
	}
	private static int[] tokenize(String next, String string) 
	{
		StringTokenizer tokenizer=new StringTokenizer(next, string);
		int bigInteger[]=new int[tokenizer.countTokens()];
		int i=0;
		while(tokenizer.hasMoreTokens())
		{
			int temp=Integer.parseInt(tokenizer.nextToken().trim());
			bigInteger[i]=temp;
			i++;
		}
		return bigInteger;
	}

}
