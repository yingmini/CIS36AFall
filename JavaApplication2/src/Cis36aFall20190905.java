/**
 * Program Name: Cis36aFall20190905.java
 * Discussion:   Java & Menu Code
 * Written By:   Ying Hsuen Lin
 * Date:         2019/09/05
 */

import java.util.*;

public class Cis36aFall20190905 
{
    //static int globalValue;
    public static void main(String[] arg)
    {
        int[] testAry1 = {1, 2, 3};
        int[] testAry2 = {-1, -2};
        int[] resulting = null;
        
        //extractLargest(testAry1, testAry2);
        extractLargest(new int[] {1, 2}, new int[5]);
        System.out.println("\nresulting.length : " +
                resulting.length + "\nLargest value : " +
                resulting[0] + "\nNumber of arrays : " +
                resulting[1]);
        
        /*
        int notKnowingWhatToDo;
        Cis36aFall2019Program1 funObj;
        
        funObj = new Cis36aFall2019Program1();
        
        notKnowingWhatToDo = 5;
        
        System.out.println("\nnotKnowingWhatToDo" + notKnowingWhatToDo);
        
        System.out.println("\nIt is a " + 5);
        
        getSmallestIntegerWithSmallestTODC(new int[0]);
        runMenuHw1();
        */
    }
    
    public static int[] extractLargest(int[] ary1, int[] ary2)
    {
        int[] resultAry = null;
        int largest;
        int count = 0;
        int aryIndexFlag = 0;
        int tmp;
        
        largest = ary1[0];
        for (int i = 1; i < ary1.length; i++)
        {
            if (largest < ary1[i])
                largest = ary1[i];
        }
        
        for (int i = 0; i < ary2.length; i++)
        {
            if (largest < ary2[i])
                largest = ary2[i];
        }
        
        for (int i = 1; i < ary1.length; i++)
        {
            if (ary1[i] == largest)
            {
                count++;
                
                i = ary1.length;
            }
        }
        
        for (int i = 0; i < ary2.length; i++)
        {
            if (ary2[i] == largest)
            {
                count++;
                
                i = ary2.length;
            }
                
        }
        
        for (int i = 0; i < ary1.length; i++)
        {
            if (count != 2)
            {
                if (ary1[i] == largest)
                {
                    aryIndexFlag = 1;
                }
            }
        }
        
        for (int i = 0; i < ary2.length; i++)
        {
            if (count != 2)
            {
                if (ary1[i] == largest)
                {
                    aryIndexFlag = 2;
                }
            }
        }
        
        resultAry = new int[1 + 1 +
                ((aryIndexFlag != 0)? 1 : 2)];
        
        resultAry[0] = largest;
        resultAry[1] = count;
        if (count == 2)
        {
            resultAry[2] = 1;
            resultAry[3] = 2;
        } else {
            resultAry[2] = aryIndexFlag;
        }
        /*
        tmp = resultAry.length + 1;
        
        System.out.println(tmp);
        */
        return resultAry;
    }
    
    public static void runMenuHw1()
    {
        int option;
        // A class + object variable
        Scanner scanner = new Scanner(System.in);
        int usrValue;
        int[] ary = null;
        int size;
        int smallestTODC = 0;
        int valueWithSmallestTODC;
        int smallestValueWithSmallestTODC;
        
        do
        {
            System.out.println("\n***" +
                    "\n  Menu for HW#1" +
                    "\n  1. Calling the required method" +
                    "\n  2. Quit" +
                    "\nEnter the option (1 or 2): ");
                    
            option = scanner.nextInt();
            
            switch (option)
            {
                case 1:
                    System.out.println("\nHow many elements? ");
                    size = scanner.nextInt();
                    
                    //allocating memory
                    ary = new int[size];
                    for (int i = 0; i < ary.length; i++)
                    {
                        System.out.println("  Value #" + (i + 1) +
                                ": ");
                        ary [i] = scanner.nextInt();
                    }
                    
                    /*
                    smallestTODC = getSmallestTODC(ary);
                    System.out.println("\nThe smallest TODC : " +
                            smallestTODC);
                    
                    valueWithSmallestTODC = getIntWithSmallestTODC(ary);
                    System.out.println("\nThe integer with" +
                            "smallest TODC : " +
                            valueWithSmallestTODC);
                    */
                    smallestValueWithSmallestTODC = 
                            getSmallestIntegerWithSmallestTODC(ary);
                    
                    System.out.println("\nThesmallest integer with" +
                            "smallest TODC : " +
                            smallestValueWithSmallestTODC);
                    /*
                    System.out.println("\nDoing fun task such as" +
                            " calling " +
                            "getSmallestIntegerWithSmallestTODC(int[] ary)\n");
                    //getSmallestIntegerWithSmallestTODC(ary);
                    
                    System.out.println("\ntodc of 12345 : " +
                            getTODC(12345));
                    for (int i = 0; i < 10; i++)
                    {
                        System.out.println("\nEnter an int: ");
                        usrValue = scanner.nextInt();
                        System.out.println("todc of " + usrValue +
                                " : " + getTODC(usrValue));
                    }
                    */
                    break;
                case 2:
                    System.out.println("\nQuitting!\n");
                    break;
                default:
                    System.out.println("\nWrong option or" +
                            "TOO MUCH FUN TO REMEMBER");
            }
            
        } while (option != 2);
        
    }
    
    public static int getSmallestIntegerWithSmallestTODC(int[] ary)
    {
        int smallestInt = getIntWithSmallestTODC(ary);
        int smallestTODC = getSmallestTODC(ary);
        
        for (int i = 0; i < ary.length; i++)
        {
            if (getTODC(ary[i]) == smallestTODC)
            {
                if (smallestInt > ary[i])
                {
                    smallestInt = ary[i];
                }
            }
        }
        
        
        
        return smallestInt;
        /*
        int smallestInt = -1;
        int tmp;
        
        int[] myAry;
        
        
        tmp = 3;
        myAry = new int[tmp];
        tmp = myAry.length;
        
        System.out.println("\n" + myAry[0]);
        
        return smallestInt;
        */
    }
    
    public static int getIntWithSmallestTODC(int[] ary)
    {
        int intWithSmallestTodc = 0;
        int smallestTodc = getSmallestTODC(ary);
        
        for (int i = 0; i < ary.length; i++)
        {
            if(smallestTodc == getTODC (ary[i]))
            {
                intWithSmallestTodc = ary[i];
                i = ary.length;
            }
        }
        
        return intWithSmallestTodc;
    }
    
    public static int getSmallestTODC(int[] ary)
    {
        //should not be equal to 0
        int smallestTodc = getTODC(ary[0]);
        
        for (int i = 1; i < ary.length; i++)
        {
            if (smallestTodc > getTODC(ary[i]))
            {
                smallestTodc = getTODC(ary[i]);
            }
        }
        
        return smallestTodc;
    }
    
    public static int getTODC(int arg)
    {
        int todc = 0;
        
        while (arg != 0)
        {
            if (arg % 2 != 0)
            {
                todc++;
            }
            
            arg /= 10;
        }
        
        return todc;
    }
}
