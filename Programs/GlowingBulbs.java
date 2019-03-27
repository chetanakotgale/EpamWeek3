package Programs;

/* 
 * 
 * This program is to find number of Glowing Bulbs.
 * @author chetana.
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class GlowingBulbs
{

	/*  
	 * @param Treeset.
	 * @param List.
	 *  
	 */
	    static Set<Integer> list = new TreeSet<>(  );
	    static List<Integer> switches = new ArrayList<>( 12 );
	    
	    public static void main( String[] args )
	    {
	        @SuppressWarnings("resource")
	        // Scanner class to read input values.
			Scanner sc = new Scanner( System.in );	
	        List<Integer> result = new ArrayList<>();
	        long k, l, h, m = 0;
	        int i;
	        long ans = 0;
	 
	        while ( sc.hasNextLine() ) {
	            list.clear();
	            switches.clear();
	            result.clear();
	            sc.nextLine();
	            String switchString = sc.nextLine();
	            k = sc.nextLong();
	 
	           
	            
	            for(i =0 ; i< switchString.length(); i++)
	            {
	                if(switchString.charAt( i )-48 == 1) switches.add( i+1 );
	            }
	 
	            l=0; h= 1000000000000000L;
	 
	            while ( l <= h ){
	                m = (l+h) >> 1;
	                if(calc(m) >= k){
	                    ans = m;
	                    h = m-1;
	 
	                }
	                else  l = m+1;
	            }
	 
	            System.out.println(ans);
	 
	        }
	    }
	 
	 
	    private static long calc( long m )
	    {
	        int p = switches.size();
	        int i,j;
	        long res = 0;
	        for(i=1; i< (1 << p); i++ ){
	            long pr = 1;
	            int sign = -1 ;
	            for(j =0; j < p; j++ ){
	                if(((i>>j)&1) == 1){
	                    pr = pr * switches.get( j );
	                    sign *= -1;
	                }
	            }
	            res += sign*(m/pr);
	        }
	        return res;
	    }
	}

