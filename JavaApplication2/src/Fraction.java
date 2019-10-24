/**
 * Program Name: Fraction.java
 * Discussion:   Tesing Fraction
 * Written By:   Ying Hsuen Lin
 * Date:         2019/09/10
 */

import java.util.*;

class Fraction extends Object
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
    
    public Fraction(int n, int d)
    {
        num = n / 1; //bring in gcdBF()
        denom = d / 1;
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
    
    public Fraction add(Fraction fr)
    {
        return new Fraction(1);
    }
    
    public int[] getUncommonDigit(Fraction[] frAry)
    {
        return null;
    }
    
    public int[] getUncommonDigitVersion2()
    {
        int[] ary = null;
        int size;
        int[] deAryForNum = new int[10];
        int[] deAryForDenom = new int[10];
        int tmp;
        int j;
        
        tmp = (num < 0) ? -num : num;
        do
        {
            deAryForNum[tmp % 10] = 1;
            
            tmp /= 10;
        } while(tmp != 10);
        
        tmp = (denom < 0) ? -denom : denom;
        do
        {
            deAryForDenom[tmp % 10] = 1;
            
            tmp /= 10;
        } while(tmp != 10);
        
        size = 0;
        for (int i = 0; i < 10; i++)
        {
            deAryForNum[i] += deAryForDenom[i];
            
            if (deAryForNum[i] == 1)
            {
                size++;
            }
        }
        
        j = 0;
        for (int i = 0; i < 10; i++)
        {
            if (deAryForNum[i] == 1)
            {
                ary[j] = i;
                j++;
            }
        }
        
        return ary;
    }
    
    public int[] getUncommonDigitVersion1()
    {
        int[] ary = null;
        int size;
        int[] dcAryForNum = new int[10];
        int[] dcAryForDenom = new int[10];
        int tmp;
        int j;
        
        tmp = (num < 0) ? -num : num;
        do
        {
            dcAryForNum[tmp % 10]++;
            
            tmp /= 10;
        } while(tmp != 10);
        
        tmp = (denom < 0) ? -denom : denom;
        do
        {
            dcAryForDenom[tmp % 10]++;
            
            tmp /= 10;
        } while(tmp != 10);
        
        size = 0;
        for (int i = 0; i < 10; i++)
        {
            if (((dcAryForNum[i] == 0) && (dcAryForDenom[i] != 0)) || 
                    ((dcAryForNum[i] != 0) && (dcAryForDenom[i] == 0)))
            {
                size++;
            }
        }
        
        ary = new int[size];
        
        j = 0;
        for (int i = 0; i < 10; i++)
        {
            if (((dcAryForNum[i] == 0) && (dcAryForDenom[i] != 0)) || 
                    ((dcAryForNum[i] != 0) && (dcAryForDenom[i] == 0)))
            {
                ary[j] = i;
                j++;
            }
        }
        
        return ary;
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
    
    @Override
    protected void finalize()
    {
        System.out.println(this.toString() + "is being removed");
    }
    
    @Override
    public String toString()
    {
        return this.getClass().getName() + '@' +
                Integer.toHexString(this.hashCode());
    }
}