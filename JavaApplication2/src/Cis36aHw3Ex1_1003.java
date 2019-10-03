/**
 * Program Name: Cis36aHw3Ex1_1003.java
 * Discussion:   Tesing Fraction 3
 * Written By:   Ying Hsuen Lin
 * Date:         2019/10/03
 */

import java.util.*;

public class Cis36aHw3Ex1_1003 
{
    public static void main(String[] arg)
    {
        runMenuHw3();
    }
    
    public static void runMenuHw3()
    {
//       Fraction3 leftFr = new Fraction3();
//       Fraction3 rightFr = null;
       
//       Fraction3[] fr3Ary = null;
       Fraction3[] fr3Ary = new Fraction3[2];
       Fraction3 result = null;
        
       int option;
       Scanner scanner = new Scanner(System.in);
        
       do
       {
           System.out.print("\nMenu HW#3" +
                   "\n");
           option = scanner.nextInt();
        
           switch (option)
           {
               case 1:
//                   if (leftFr == null)
//                   {
//                       leftFr = createFraction3();
//                   }
                   fr3Ary = runInitializationMenu(fr3Ary);
                   //Additional codes is needed
                   break;
               case 2:
                   break;
               default:
           } 
        } while (option != 2);
    
    public static Fraction3[] runInitializationMenu(Fraction3[] ary)
    {
        int s1;
        int n1;
        int d1;
        
        Scanner scanner = new Scanner(System.in);
        
        if (ary[0] != null)
        {
            // Do create 2 new Fraction3 Objects
            ary = new Fraction3[2];
            
            System.out.println("\nCreating the first Fraction3 object-" +
                    "\nEnter the sign info: ");
            s1 = scanner.nextInt();
            
            System.out.println("\nEnter an int for num: ");
            n1 = scanner.nextInt();
            
            System.out.println("\nEnter an int for denom: ");
            d1 = scanner.nextInt();
            
            ary[0] = new Fraction3(s1, n1, d1);
            
            System.out.println("\nCreating the first Fraction3 object-" +
                    "\nEnter the sign info: ");
            s1 = scanner.nextInt();
            
            System.out.println("\nEnter an int for num: ");
            n1 = scanner.nextInt();
            
            System.out.println("\nEnter an int for denom: ");
            d1 = scanner.nextInt();
            
            ary[1] = new Fraction3(s1, n1, d1);
            
//            return new Fraction3[] 
//            {new Fraction3(), new Fraction3()};
        } else
        {
            // Update the existing object(s)
//            return new Fraction3[] 
//            {new Fraction3(), new Fraction3()};
        }
        
        return ary;
    }
    
    public static createFraction3()
    {
        
    }
}

