package Programs;
/* 
 * 
 * This program is to implement RodCutting i.e, to find number of special rods.
 * @author chetana.
 * 
 */

import java.util.Scanner;

public class RodCuttingProblem
{

	    	private static Scanner s;

			public static void main(String args[])throws Exception
		    {
				/*
				 * using Scanner to read the input values
				 */
	       
	        s = new Scanner(System.in); 	
			int testcases=s.nextInt();
			int input_number[]=new int[1000];
			for(int i=0;i<testcases;i++)
			{
				input_number[i]=s.nextInt();
			}
			
			/* 
			 * This loop calculates the count of special rods.
			 */
			for(int i=0;i<testcases;i++)
			{
			    	int c=0,temp=0;
				if(input_number[i]==3)
				{
				    c=1;
				}
				else
				{
				    temp=3;
				    while(temp<=input_number[i])
				    {
				        temp=temp*2+1;
			        	        c++;
				    }
				}
				System.out.println(c);
				        
			}
		}
	}


