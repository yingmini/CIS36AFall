/**
 * Program Name: Cis36aDriver1015.java
 * Discussion:   Fraction HW
 * Written By:   Ying Hsuen Lin
 * Date:         2019/10/15
 */

import java.util.*;

class Cis36aDriver1015
{
    public static void main(String[] arg)
    {
        Fraction fr1 = new Fraction(24910);
        Fraction fr2 = lfr.prnew Fraction(5);
        int[] ary = fr1.getUncommonDigitVersion2();
        
        for (int tmp : ary)
        {
            System.out.print("\n" + tmp);
        }
        
        FractionUtility.add(fr1, fr2);
        //fr1.add(fr2);
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
    }
    
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
    
    public static Fraction3 createFraction3()
    {
        return new Fraction3();
    }
    
    public static Fraction3[] runCreatingSubmenu()
    {
        int s = 1;
        int n = 0;
        int d = 1;
        
        return new Fraction3[]
        {new Fraction3(s, n, d), new Fraction3(s, n, d)};
    }
    
    public static void runCreatingSybMenu(Fraction3[] ary)
    {
        Fraction3[] localAry1 = {new Fraction3(), new Fraction3()};
        Fraction3[] localAry2 = new Fraction3[]
        {new Fraction3(), new Fraction3()};
        
        ary = new Fraction3[2];
        
        System.out.println("\nary : " + ary + "\nary[0] : " +
                ary[0] + "\nary[1] : " + ary[1]);
    }
    
    public static void runCreatingSybmenu(Fraction3 left, Fraction3 right)
    {
        //your code
    }
}

