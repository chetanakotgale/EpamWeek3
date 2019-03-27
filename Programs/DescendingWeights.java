package Programs;

/* 
 * 
 * This program is to find Descending weights.
 * @author chetana.
 * 
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DescendingWeights
{
	/*
	 *  Static class to assign value and weight values.
	 */
	      
        static class Pair{
            int value;
            int weight;
            Pair(int value, int weight) {
                this.value  = value;
                this.weight = weight;
            }
        }
        
        /*
         * Comparator is used to compare the weights.
         */
        
        static Comparator<Pair> DESC = new Comparator<Pair>() {
          public int compare(Pair p1, Pair p2) {
              if(p1.weight == p2.weight) {
                  return p1.value - p2.value;
              }
              return p2.weight - p1.weight;
          }  
        };
        public static void main(String args[] ) throws Exception {
            
            try(Scanner scanner = new Scanner(System.in)) {
                int N = scanner.nextInt();
                int d = scanner.nextInt();
                int max = Integer.MIN_VALUE;
                Pair[] array = new Pair[N];
                for(int i = 0; i < N; i++) {
                    int value = scanner.nextInt();
                    int weight = value%d;
                    /*
                     * Passing the values to static class
                     */
                    array[i] = new Pair(value, weight);
                    if(weight>max) {
                        max = weight;
                    }
                }
                /*
                 * sorting the array
                 */
                Arrays.sort(array, DESC);
               
                print(array);
                
            }
     
        }
        /*
         * Function to print list.
         */
        
        static void print(Pair[] list) {
            for(Pair p : list) {
                System.out.print(p.value+" ");    
            }
            
        }
    }

