package CodeVita.LongestProgressiveSequence;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestProgressiveSequence2 {
static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of elements in series");
		int n=scanner.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> temp1=new ArrayList<Integer>();
		ArrayList<Integer> temp2=new ArrayList<Integer>();
		
		System.out.println("Enter Elements");
		for (int i = 0; i < n; i++) 
		{
		list.add(scanner.nextInt());	
		}
		
		for (int i = 0; i < list.size(); i++)
		{
			if(temp2.isEmpty())
			{
				temp2.add(list.get(i));
			}
			else
			{
			System.out.println(list.get(i)+" "+temp2.get(temp2.size()-1));
				if(list.get(i)<temp2.get(temp2.size()-1))
				{
					if(temp1.size()<temp2.size())
					{
						temp1=temp2;
						temp2.removeAll(temp2);
					}
				}
				if(list.get(i)>=temp2.get(temp2.size()-1))
				{
					temp2.add(list.get(i));
				}
			}
	
		}
		for (int i = 0; i < temp1.size(); i++) {
			System.out.print(temp1.get(i)+" ");
		}
	
	}

}
