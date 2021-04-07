package CodeVita.CollectingCandies;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CollectingCandies {
	static Scanner scanner=new Scanner(System.in);
	static Scanner strscanner=new Scanner(System.in).useDelimiter("\n");
	public static void main(String[] args) {
		int numberOfcases=scanner.nextInt();
		int cnt=0;
		
		while(cnt!=numberOfcases)
		{
			int time=0;
			int nb=scanner.nextInt();
			System.out.println("Enter input");
			
			int[] boxes=tokenize(strscanner.next()," ");	
//			for (int i = 0; i < boxes.length; i++)
//			{
//			System.out.print(boxes[i]);
//			}
			
			int a=boxes[0];
			int b=boxes[1];
			time+=a+b;
			System.out.println(b+" "+time);
			int ft=time;
			for (int i = 2; i < boxes.length; i++) 
			{
				b=boxes[i];
				time+=b;
				System.out.println(b+" "+time);
				ft+=time;
			}
			System.out.println(ft);
			cnt++;
		}
	}
	private static int[] tokenize(String next, String string) {
		StringTokenizer tokenizer=new StringTokenizer(next,string);
		int arr[]=new int[tokenizer.countTokens()];
		int i=0;
		while(i<=tokenizer.countTokens()+3)
		{
			arr[i]=Integer.parseInt(tokenizer.nextToken().trim());
//			System.out.print(arr[i]+" ");
			i++;
		}
		return arr;
	}

}
