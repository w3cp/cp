
/*********************************************************
*                                                        *
* // 2015-08-17-20-20                                    *
*                                                        *
* // to find out sqrt                                    *
*                                                        *
* // MD ANWAR HOSSAIN                                    *
* // http://w3cp.blogspot.com                            *
*                                                        *
* // https://github.com/w3cp/                            *
* // https://github.com/w3cp/cp/blob/master              *
*                            /function/MySqrt.java       *                                                         *                                    *                                                        *
*                                                        *
*********************************************************/

import java.util.Scanner; // program uses class Scanner

public class MySqrt
{

    public static void main( String[] args )
    {
    
        // create Scanner for input from command window
        Scanner input = new Scanner( System.in );
        
        // prompt for and input a number
        System.out.print( "Enter a numner : " );
        
        double number = input.nextDouble(); // read a numner
        
        // determine the sqrt
        double sqrt = mySqrt( number );
        
        // display the sqrt
        System.out.printf( "\nThe sqrt of %.2f is %.2f" , number , sqrt ); 
                       
    } // end main
    
    
    // returns the sqrt of its parameter
    public static double mySqrt( double number )
    {
    
        double low = 0.0; // assume 0.0 is the lowest value 
        double high = number; // assume num is the largest value
        double mid = 0; // to store the middle value ( low plus high divided by 2 )
        
        while (high - low > 0.000000001 ) // loop till low is nearly equal to high
        {
        
            mid = (low + high) / 2; // assign middle value to mid
        
            // if mid * mid is greater than the number
            if (mid * mid > number)         
                high = mid; // assign mid to high
            
            else // if mid * mid is lower than the number
                low = mid; // add mid to low   
                    
        } // end while    
        
        return mid; // return mid
        
    } // end method mySqrt   
    
} // end class MySqrt
