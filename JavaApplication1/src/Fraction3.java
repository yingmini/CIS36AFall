/**
 * Program Name: Fraction3.java
 * Discussion:   Tesing Fraction 3
 * Written By:   Ying Hsuen Lin
 * Date:         2019/09/10
 */

import java.util.*;

class Fraction3 
{
    /*public char sign;
    public int num;
    public int denom;
    
    public Fraction3()
    {
        sign = '+';
        // num = 0; //there is a value already
        denom = 1;
    }
    
    public int convertSing()
    {
        if (sign == 1)
        {
            return 1;
        } else
        {
            return -1;
        }
        /*
        int flag = -1;
        if (sign == '+')
        {
            flag = 1;
        }
        return flag;
        */
//    }
    private int sign; // 1 : positive, -1 : negative
    private int num;
    private int denom; // Must be different than 0
    
    public Fraction3() // Default constructor
    {
        sign = 1;
        num = 0;
        denom = 1;
    }
    
    public Fraction3(int n) // n will be use to assign to numerator
    {
        sign = 1;
        num = n;
        denom = 1;
    }
    
    public Fraction3(int s, int n, int d)
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
