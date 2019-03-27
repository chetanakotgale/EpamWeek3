package Programs;

/* 
 * 
 * This program is to find number of Glowing Bulbs.
 * @author chetana.
 * 
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class IndianArmy 
{
	
	public static void main(String args[] ) throws Exception {
            
           int i,n;
            long s,e,sum=0;
             long a[] = new long[10000000];		//position of army 
              long b[] = new long[1000000]; 	//army size 
              TreeMap<Long,Long> map=new TreeMap<Long,Long>();	//mapping input values in Treemap.
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
            s=sc.nextLong();
            e=sc.nextLong();
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
                b[i]=sc.nextLong();
            }
            
          /*
           * 	Storing added and subtracted values of position and army size to a and b arrays.
           */
            
           for(i=0;i<n;i++)
           {
               map.put(a[i]-b[i],a[i]+b[i]);
           }
            Long low=s;
           Long high,plow,phigh;
        
                   for(Map.Entry treemap:map.entrySet())
                   { 
        
                    plow=(long)treemap.getKey();
                    phigh=(long)treemap.getValue();
           
                 
                     high=phigh;
                    if(e<plow)
                    break;
                    if(low<plow)
                    sum=sum+plow-low;
                    if(high>low)
                    low=high;
                     
                  }
                 if(low<e)
                 sum=sum+e-low;
                 System.out.println(sum);
           }
     
        }
     
     
     