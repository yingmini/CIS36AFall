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
        
        Cis36aHw3Utility.runMenuHw3();
    }
    
    public static void runMenuHw3Ex1()
    {
        Fraction3 leftFr = null;
        Fraction3 rightFr = null;
        
        runCreatingSubMenu(leftFr, rightFr);
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
