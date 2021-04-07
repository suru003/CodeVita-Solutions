package CodeVita.VitaSum;

import java.util.Scanner;
import java.util.StringTokenizer;

public class VitaSum {
	static Scanner scanner=new Scanner(System.in).useDelimiter("\n");
	public static void main(String[] args) {

		String[] string=tokenize(scanner.next()," ");
		int n=Integer.parseInt(string[0]);
		int k=Integer.parseInt(string[1]);

		int nfact=fact(n);
		int i=0;
		int sum=0;
		while(i<=k)
		{
			int numerator=nfact;
			int denominator=fact(i)*fact(n-i);
			sum+=numerator/denominator;
			i+=2;
		}
		System.out.println(sum);
	}
	private static int fact(int n) 
	{
		if(n==1 || n==0)
			return 1;
		else
		{
			int i=n-1;
			while(i>=1)
			{
				n=n*i;
				i--;
			}
		}
		return n;
	}
	private static String[] tokenize(String next, String string) {
		StringTokenizer tokenizer=new StringTokenizer(next, string);
		String string2[]=new String[tokenizer.countTokens()];
		int i=0;
		while(tokenizer.hasMoreTokens())
		{
			string2[i]=tokenizer.nextToken();
			i++;
		}
		return string2;
	}

}
