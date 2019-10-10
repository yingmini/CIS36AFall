/**
 * Program Name: Fraction.java
 * Discussion:   Tesing Fraction
 * Written By:   Ying Hsuen Lin
 * Date:         2019/09/10
 */

import java.util.*;

class Fraction 
{
    //public char sign;
    public int num;
    public int denom; //implied instruction
    
    public Fraction()
    {
        // num = 0; //there is a value already
        //denom = 1;
        
        //Fraction(5);
        this(5);
        
        getNum();
    }
    
    public Fraction(int n)
    {
        num = n;
        denom = 1;
    }
    
    public int getNum()
    {
        return num;
    }
    
    public void setNum(int n)
    {
        num = n;
    }
    
    public void gsetDenom(int d)
    {
        //denom = d : may ne BAD
    }
    
    public int getDenom()
    {
        return denom;
    }
    
    public void update(int n, int d)
    {
        
    }
    
    public static void copyFrom(Fraction fr)
    {
        
    }
    
    public static Fraction copy(Fraction fr)
    {
        Fraction frTmp = new Fraction();
        
        frTmp.num = fr.num;
        frTmp.denom = fr.denom;
        
        return frTmp;
    }
    
    public Fraction copy()
    {
        Fraction frTmp = new Fraction();
        
        frTmp.num = num;
        frTmp.denom = denom;
        
        return frTmp;
    }
    
    public int convertSing()
    {
        int flag = -1;
        int tmp;
        
        for (int i = 0; i < 10; i++)
        {
            //int tmp = 1;
            tmp = i;
        }
        
        return flag;
    }
}