package CodeVita.CalSalaryAndPF;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CalSalaryAndPF {
static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Date of Joining");
		String string=scanner.next();
		int date[]=getDate(string);
//		System.out.println(date[0]+"/"+date[1]+"/"+date[2]);
		if((date[0]<1 || date[0] > 31) && ((date[1]<1 || date[1] > 12)))
			System.out.println("Error in Date");
		else
		{
			System.out.println("Enter Salary");
			int salary=scanner.nextInt();
			System.out.println("Enter years");
			int year=scanner.nextInt();

			if(year>0)
			{
			int[] salaryNew=calculateSalary(date,salary,year);
			System.out.println("Final Salary = "+salaryNew[0]+"\nFinal Accumulated PF "+salaryNew[1]+"\n anInc "+salaryNew[2]+"\n ayInc "+salaryNew[3]);
			}
			else 
			{
				System.out.println("Not Eligible");
			}
			}
	}

	private static int[] calculateSalary(int[] date, int salary, int year) {
		int PF=0;
		int anInc=0,ayInc=0;
		
//		if(date[1]==4)
//		{
			for(int i = 0 ; i < year ; i++)
			{
				if( i < 3 )
				{
					if(i==year-1)
					{
						if(date[1]==4)
						{
						anInc=(int) Math.ceil(0.11*salary);
						ayInc=(int) Math.ceil(0.12*salary);
						PF+=(int) Math.ceil(0.12*salary);
						salary+=anInc+ayInc;
						}
						else
						{
							ayInc=(int) Math.ceil(0.12*salary);
							PF+=(int) Math.ceil(0.12*salary);
							salary+=ayInc;
							}
					}
					else
					{
					anInc=(int) Math.ceil(0.11*salary);
					ayInc=(int) Math.ceil(0.12*salary);
					PF+=(int) Math.ceil(0.12*salary);
					salary+=anInc+ayInc;
					}				
					}
				else if( i >= 3 && i < 7 )
				{
					if(i==year-1)
					{
						if(date[1]==4)
						{
						anInc=(int) Math.ceil(0.09*salary);
						ayInc=(int) Math.ceil(0.20*salary);
						PF+=(int) Math.ceil(0.12*salary);
						salary+=anInc+ayInc;
						}
						else
						{
							ayInc=(int) Math.ceil(0.20*salary);
							PF+=(int) Math.ceil(0.12*salary);
							salary+=ayInc;
							}
					}
					else
					{
					anInc=(int) Math.ceil(0.09*salary);
					ayInc=(int) Math.ceil(0.20*salary);
					PF+=(int) Math.ceil(0.12*salary);
					salary+=anInc+ayInc;
					}
				}
				else
				{
				if(i==year-1)
				{
					if(date[1]==4)
					{
					anInc=(int) Math.ceil(0.06*salary);
					ayInc=(int) Math.ceil(0.15*salary);
					PF+=(int) Math.ceil(0.12*salary);
					salary+=anInc+ayInc;
					}
					else
					{
						anInc=(int) Math.ceil(0.06*salary);
						PF+=(int) Math.ceil(0.12*salary);
						salary+=anInc;
						}
				}
				else
				{
				anInc=(int) Math.ceil(0.06*salary);
				ayInc=(int) Math.ceil(0.15*salary);
				PF+=(int) Math.ceil(0.12*salary);
				salary+=anInc+ayInc;
				}
				}
			}
//		}
//		else 
//		{
//			for(int i=0 ;i < year ;i++)
//			{
//				if(i<4)
//				{
//					
//				}
//				if(i>=4 && i < 8)
//				{
//					
//				}
//				else
//				{
//					
//				}
//			}
//		}
		int arrRes[]={salary,PF,anInc,ayInc};
		return arrRes;
	}
	private static int[] getDate(String string) {
		int date[]=new int[3];
		int ptr=0;
		StringTokenizer tokenizer=new StringTokenizer(string,"//");
		while(tokenizer.hasMoreTokens())
		{
			date[ptr]=Integer.parseInt(tokenizer.nextToken());
			ptr++;
		}
		return date;
	}

}
