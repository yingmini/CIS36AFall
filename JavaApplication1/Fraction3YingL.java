/*
 * Program Name: Fraction3YingL.java
 * Discussion:   Fraction3YingL class
 * Written By:   Ying Hsuen Lin
 * Date:         2019/10/17
 */

import java.util.*;

public class Fraction3YingL 
{
    private int sign; // 1 : positive, -1 : negative
    private int num;
    private int denom; // Must be different than 0
    
    public Fraction3YingL() // Default constructor
    {
        sign = 1;
        num = 0;
        denom = 1;
    }
    
    public Fraction3YingL(int n) {
        sign = n < 0 ? -1 : 1;
        num = n < 0 ? -n : n;
        denom = 1;
    }
    
    public Fraction3YingL(int s, int n, int d)
    {
        // simplification
        sign = ((n * d) < 0 ? -s : s);
        num = ((n / gcdBF(n, d)) < 0 ? 
                -(n / gcdBF(n, d)) : (n / gcdBF(n, d)));
        if (n == 0)
            denom = 1;
        else
            denom = ((d / gcdBF(n, d)) < 0 ? 
                    -(d / gcdBF(n, d)) : (d / gcdBF(n, d)));
    }
    
    public void print()
    {
        System.out.println("\n  {sign: " + sign +", num: " +
                num + ", denom: " + denom + "}");
    }
    
    public static int gcdBF(int n, int d)
    {
        int gcd = 1;
        
        if (n < 0)
            n = -n;
        
        if (d < 0)
            d = -d;
        
        for (int i = 1; i <= n && i <= d; i++)
            if(n % i == 0 && d % i == 0)
                gcd = i;
        
        return gcd;
    }
    
    public Fraction3YingL add(Fraction3YingL fr)
    {
        int resultNum = (this.sign * this.num) * fr.denom + 
                (fr.sign * fr.num) * denom;
        int resultDenom = this.denom * fr.denom;
        int resultSign = 1;
        return new Fraction3YingL(resultSign, resultNum, resultDenom);
    }
    
    public Fraction3YingL sub(Fraction3YingL fr)
    {
        int resultNum = (this.sign * this.num) * fr.denom - 
                (fr.sign * fr.num) * denom;
        int resultDenom = this.denom * fr.denom;
        int resultSign = 1;
        return new Fraction3YingL(resultSign, resultNum, resultDenom);
    }
    
    public Fraction3YingL mul(Fraction3YingL fr)
    {
        int resultNum = (this.sign * this.num) * fr.num;
        int resultDenom = this.denom * fr.denom;
        int resultSign = 1;
        return new Fraction3YingL(resultSign, resultNum, resultDenom);
    }
    
    public Fraction3YingL div(Fraction3YingL fr)
    {
        int resultNum = (this.sign * this.num) * fr.denom;
        int resultDenom = this.denom * (fr.sign * fr.num);
        int resultSign = 1;
        return new Fraction3YingL(resultSign, resultNum, resultDenom);
    }
}