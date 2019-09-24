/**
 * Program Name: Cis36aFall20190910.java
 * Discussion:   Tesing Fraction 3
 * Written By:   Ying Hsuen Lin
 * Date:         2019/09/10
 */

import java.util.*;

public class Cis36aFall20190910 
{
    public static void main(String[] arg)
    {
        Fraction3 fr3Objl; //fr3Objl is an object reference 
                           //variable. The referenced object 
                           //must be of type Fraction3
        //Fraction3B fr3BObjl;
        Scanner scanner = new Scanner(System.in);
                           
        fr3Objl = null;
        System.out.println("\nValue stored in fr3Objl : " +
                fr3Objl);
        fr3Objl = new Fraction3();
        System.out.println("\nValue stored in fr3Objl : " +
                fr3Objl + "\n  sign : " + fr3Objl.sign +
                "\n  num : " + fr3Objl.num + "\n  denom : " +
                fr3Objl.denom);
        
        fr3Objl.sign = '+';
        fr3Objl.denom = scanner.nextInt();
        
        System.out.println("\nValue stored in fr3Objl : " +
                fr3Objl + "\n  sign : " + fr3Objl.sign +
                "\n  num : " + fr3Objl.num + "\n  denom : " +
                fr3Objl.denom);
        
        fr3BObjl = new Fraction3B();
//        System.out.println("\nValue stored in fr3Objl : " +
//                fr3Objl + "\n  sign : " + fr3Objl.sign +
//                "\n  num : " + fr3Objl.num + "\n  denom : " +
//                fr3Objl.denom);
    }
}
