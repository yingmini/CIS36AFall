/**
 * Program Name: Cis36aFall20190924.java
 * Discussion:   Tesing Fraction 3
 * Written By:   Ying Hsuen Lin
 * Date:         2019/09/24
 */

import java.util.*;

public class Cis36aFall20190924 
{
    public static void main(String[] arg)
    {
        Fraction3YingL fr3Objl; //fr3Objl is an object reference 
                           //variable. The referenced object 
                           //must be of type Fraction3
        
        Scanner scanner = new Scanner(System.in);
                           
        fr3Objl = null;
        System.out.println("\nValue stored in fr3Objl : " +
                fr3Objl);
        
        fr3Objl = new Fraction3YingL();
        
        System.out.println(fr3Objl.getSign());
        
        System.err.println("\nThe product of num and denom of " +
        //        fr3Obj1 + " : " + fr3Obj1.getNum() * fr3Obj1.getDenom());
                fr3Objl + " : " + fr3Objl.getProductOfNumAndDenom());
        
        
        
    }
}
