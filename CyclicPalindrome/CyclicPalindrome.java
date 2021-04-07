package CodeVita.CyclicPalindrome;

import java.util.Scanner;

public class CyclicPalindrome {
static Scanner scanner=new Scanner(System.in);

public static void main(String[] args) 
	{
	String string=scanner.next();
	int fcnt=0,lcnt=0;
	int i=0;
	int j=string.length()-1;
	
	while(fcnt<string.length())
	{
		if(isPalindrome(i,j,string))
		{
//			System.out.println(fcnt);
			break;
		}
		else
		{
			i=(i+1)%string.length();
			j=(j+1)%string.length();
		fcnt++;
		}
	}
	i=string.length()-2;
	j=string.length()-3;
	while(lcnt<string.length())
	{
		if(isPalindrome(i,j,string))
		{
//			System.out.println(lcnt);
			break;
		}
		else
		{
			i=(i+1)%string.length();
			j=(j+1)%string.length();
		lcnt++;
		}
	}
	
	if(fcnt>=string.length())
		System.out.println(-1);
	else {if(fcnt<lcnt)System.out.println(fcnt);else System.out.println(lcnt);}
	}

private static boolean isPalindrome(int i, int j, String string) 
{
	int cnt=0;
	while(cnt<string.length())
	{
		if(string.charAt(i)!=string.charAt(j))
			return false;
		else
		{
			i=(i+1)%string.length();
			if(j==0)
			j=string.length()-1;
			else j=j-1;
		}
		cnt++;
	}
	return true;
}
}
