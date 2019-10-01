/*
 * Program Name: Fraction3YingL.java
 * Discussion:   Fraction3YingL class
 * Written By:   Ying Hsuen Lin
 * Date:         2019/10/01
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
    
    public Fraction3YingL(int n) // n will be use to assign to numerator
    {
        sign = 1;
        num = n;
        denom = 1;
    }
    
    public Fraction3YingL(int s, int n, int d)
    {
        sign = s; // need conditioning
        num = n;
        denom = d; // need conditioning
        
        // siplification
    }
    
    public int getSign()
    {
        
        return sign;
    }
    
    public int getNum()
    {
        return num;
    }
    
    public int getDenom()
    {
        return denom;
    }
    
    public void print()
    {
        System.out.println("\n  {sign: " + sign + ", num: " + num +
                ", denom: " + denom + "}");
    }
    
    public int getProductOfNumAndDenom()
    {
        //return this.getNum() * getDenom();
        return num * denom;
    }
    
    public Fraction3 add(Fraction3 fr)
    {
        return new Fraction3();
    }
}

/**Program Output

*/

/**Logic Code Output Issues
 * 
 */