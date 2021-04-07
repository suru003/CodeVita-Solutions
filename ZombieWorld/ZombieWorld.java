package CodeVita.ZombieWorld;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ZombieWorld {
	static Scanner scanner=new Scanner(System.in).useDelimiter("\n");
	static Scanner scanner2=new Scanner(System.in);	
	public static void main(String[] args) 
	{
		int cnt=scanner2.nextInt();
		while(cnt>0)
		{
			System.out.println(canReach());
			cnt--;
		}
		
	}
	private static String canReach() 
	{
		int nt[]=tokenize(scanner.next().trim()," ");
		int energies[]=tokenize(scanner.next().trim()," ");
		int pd[]=tokenize(scanner.next().trim()," ");
		int n=nt[0];
		int t=nt[1];
		int p=pd[0];
		int d=pd[1];
		ArrayList<Integer> zombies=new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++)
		{
			zombies.add(energies[i]);
		}
		Collections.sort(zombies);
		int curenergy=p;
		if(t>=n)
		{
			for (int i = 0; i < zombies.size(); i++)
			{
				if(curenergy>=zombies.get(i))
				{
					curenergy=curenergy+(curenergy-zombies.get(i));
				}
				else return "No";
			}
			if(curenergy>=d)
				return "Yes";
			else
				return "No";
		}
		else
			return "No";
	
	}
	private static int[] tokenize(String trim, String string) 
	{
		StringTokenizer tokenizer=new StringTokenizer(trim,string);
		int ret[]=new int[tokenizer.countTokens()];
		int i=0;
		while(tokenizer.hasMoreTokens())
		{
			ret[i]=Integer.parseInt(tokenizer.nextToken());
			i++;
		}
		return ret;
	}

}
