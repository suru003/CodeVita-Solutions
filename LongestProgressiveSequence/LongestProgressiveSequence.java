package CodeVita.LongestProgressiveSequence;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LongestProgressiveSequence {

	static Scanner scanner=new Scanner(System.in);
	static Scanner lineReader=new Scanner(System.in).useDelimiter("\\n");
	public static void main(String[] args) 
	{
		System.out.println("Enter length");
		int l=scanner.nextInt();
		String arr[]=new String[l];
		int ptr=0;
		int[] temp1=new int[l];
		int[] temp2=new int[l];

		
		System.out.println("Enter input separated by \" \"");
		String string=lineReader.next();

		StringTokenizer tokenizer=new StringTokenizer(string," ");
		if(tokenizer.countTokens()!=l)
		{
			System.out.println("Mismatch in Number");
			return;
		}
		else
		{
		while (tokenizer.hasMoreElements()) 
		{
			arr[ptr]=tokenizer.nextToken();
			if(ptr<l)
			ptr++;
		}
		}
		ptr=0;
		
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
			if(i==0)
				{temp2[ptr]=Integer.parseInt(arr[i]+"");ptr++;}
			else if(Integer.parseInt(arr[i]+"")>=temp2[ptr-1])
				{temp2[ptr]=Integer.parseInt(arr[i]+"");ptr++;}
			else 
			{
				if(temp1.length<=temp2.length)
					temp1=temp2;
				else temp2=new int[l];
			}
		}
	
	
	for (int i = 0; i < temp1.length; i++) {
		System.out.print(" "+temp1[i]);
	}
	
	}

}
