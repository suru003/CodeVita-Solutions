package CodeVita.NumberGame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberGame {
	static Scanner scanner=new Scanner(System.in);
	static int cnt=0;
	
	public static void main(String[] args) {
		System.out.println("Enter number of elements on table");
		int n=scanner.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter Elements present on the table");
		for (int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}
//		for (int i = 0; i < n; i++) {
//		System.out.print(arr.get(i)+" ");
//		}
//		System.out.println();
		for (int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i)!=1)
			{
				ArrayList<Integer> factors=findDivisors(arr.get(i));
				for (int j = factors.size()-1; j >= 0 ; j--) 
				{
					if(!isPrime(factors.get(j)))
							{
							System.out.println(arr.get(i)+" is replaced by "+factors.get(j));
							arr.remove(arr.get(i));
							arr.add(factors.get(j));
							i--;
							cnt++;
							break;
							}
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		
		if(cnt%2!=0)
		{
			System.out.println("WINNER : AMAN");
		}
		else 
			System.out.println("WINNER : JASBIR");
	}


	private static boolean isPrime(Integer integer) {
		if(integer==1)
			return false;
		if(integer==2)
			return true;
		for (int i = 2; i <= integer/2; i++) 
		{
			if(integer%i==0)
				return false;
		}
		return true;
	}

	private static ArrayList<Integer> findDivisors(int i) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for (int j = 1; j <= i/2; j++) {
			if(i%j==0){arrayList.add(j);}
		}
		return arrayList;
	}

}

//private static ArrayList<Integer> sort(ArrayList<Integer> factors) {
//ArrayList<Integer> arrayList=new ArrayList<Integer>();
//for (int i = 0; i < arrayList.size()-1; i++) {
//	for (int j = i+1; j < arrayList.size(); j++) {
//		if(arrayList.get(i)<arrayList.get(j))
//		{
//			int temp = arrayList.get(j);
//			arrayList.set(j, arrayList.get(i));
//			arrayList.set(i, temp);
//		}
//	}
//}
//
//return arrayList;
//}
