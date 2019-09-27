/**
 * Program Name: Cis36aFall20190924Hw3Ex1.java
 * Discussion:   Tesing Fraction 3
 * Written By:   Ying Hsuen Lin
 * Date:         2019/09/24
 */

import java.util.*;

public class Cis36aFall20190924Hw3Ex1 
{
    public static void main(String[] arg)
    {
        Cis36aHw3Utility util = null;
        
        util = new Cis36aHw3Utility();
        util.runMenuHw3();
        
        Cis36aHw3Utility.runMenuHw3Ex1();
    }
       
    public static int gcdBF(int arg1, int arg2)
    {
        int gcd = 1;
        
        for (int i = 2; i <= arg1 && i <= arg2; i++)
            if (arg1 % i == 0 && arg2 % i == 0)
                gcd = i;
        return gcd;
    }
    public static int gcdRecur(int arg1, int arg2)
    {
        if (arg1 % arg2 == 0)
            return arg2;
        else
            return gcdRecur(arg2, arg1 % arg2);
    } 
    
    public static void runMenuHw3Ex1()
    {
        Fraction3 leftFr = new Fraction3(); //bad
        Fraction3 rightFr = null;
        
        Fraction3[] fr3Ary = null; //A reference to an array
        Fraction3 result = null;
        
        //runCreatingSubMenu(leftFr, rightFr);
        runCreatingSubMenu(fr3Ary);
        frAry = runCreatingSubMenu();
    }

    public static void runCreatingSubMenu()
    {
        int s = 1;
        int n = 0;
        int d = 1;
        
        return new Fraction3[] {new Fraction3(s, n, d), 
                                new Fraction3(s, n, d)};
    }
    
    public static void runCreatingSubMenu(Fraction3[] ary)
    {
       Fraction3[] localAry1 = {new Fraction3(), new Fraction3()};
       Fraction3[] localAry2 = new Fraction3[]
                                   {new Fraction3(), new Fraction3()};

       ary = new Fraction3[2];

       System.out.println("\nary : " + ary +
           "\nary[0] : " + ary[0] + "\nary[1] : " + ary[1]);
    }
    
    public static void runCreatingSubMenu
        (Fraction3 left, Fraction3 right)
    {
        //your code
    }
    
    public static void runArithmeticSybMenu()
    {
        runCreatingSubMenu(null, null);
    }
}
