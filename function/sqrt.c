// 2015-08-17-20-09

// to find out sqrt

// MD ANWAR HOSSAIN
// http://w3cp.blogspot.com

// https://github.com/w3cp/
// https://github.com/w3cp/cp/blob/master/function/sqrt.c


#include <stdio.h>

double mysqrt(double num);

int  main()

{

    double x ;
    
    scanf("%lf" , &x);
    
    printf("%0.2lf\n" , mysqrt(x) );
    
    return 0;
    
}

double mysqrt(double number) {
    
    double low, high, mid;
    
    low = 0.0;
    
    high = number;
    
    while (high - low > 0.000000001 ) {
        
        mid = (low + high) / 2;
        
        if (mid * mid > number)
        
            high = mid;
            
        else 
        
            low = mid;
        
    }
    
    return mid;
    
}
    
