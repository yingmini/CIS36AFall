/**
 * Program Name: Cis36aFall2019YingLHw2Ex1.java
 * Discussion:   Hw #2, Ex #1
 * Written By:   Ying Hsuen Lin
 * Date:         2019/09/17
 */

import java.util.*;

public class Cis36aFall2019YingLHw2Ex1
{
    public static void main(String[] arg)
    {
        System.out.print("CIS 36A - Java Programming" +
                "\nLaney College" +
                "\nYing Hsuen Lin" +
                "\n\nAssignment Information --" +
                "\n  Assignment Number: Homework 02," +
                "\n                     " +
                "Coding Assignment -- Exercise #1" +
                "\n  Written by:        Ying Hsuen Lin" +
                "\n  Due Date:          2019/09/17");
		
        runMenu();
    }
    
    public static int runMenu()
    {
        int option;
        int size;
        int[] ary = null;
        int[] ary1;
        int[] ary2;
        Scanner scanner = new Scanner(System.in);
        
        do
        {
            System.out.print("\n\n\n*******************" +
                    "*****************************" +
                    "\n*                     " +
                    "MENU                     *" +
                    "\n* (1) Calling " +
                    "extractLargestAndSmallestYingL() *" +
                    "\n* (2) Quit             " +
                    "                        *" +
                    "\n***********************" +
                    "*************************" +
                    "\nEnter your option (1 or 2): ");
            option = scanner.nextInt();
            
            switch (option)
            {
                case 1:
                    System.out.print("\nBuilding the first array -" +
                            "\n  Enter the array size: ");
                    size = scanner.nextInt();
                    System.out.println("  Enter the " +
			    "array element values -");
                    
                    ary1 = new int[size];
                    for (int i = 0; i < ary1.length; i++)
                    {
                        System.out.print("    Index " + i + ": ");
                        ary1[i] = scanner.nextInt();
                    }
                    
                    System.out.print("\nBuilding the second array -" +
                            "\n  Enter the array size: ");
                    size = scanner.nextInt();
                    System.out.println("  Enter the " +
                            "array element values -");
                    
                    ary2 = new int[size];
                    for (int i = 0; i < ary2.length; i++)
                    {
                        System.out.print("    Index " + i + ": ");
                        ary2[i] = scanner.nextInt();
                    }
                    
                    System.out.println("\nCalling extractLargest" +
                            "AndSmallestYingL() --\n\n" + 
                            "After finishing the call," +
                            " the returning array -\n");
                    
                    extractLargestAndSmallestYingL
                        (ary1, ary2);
                    
                    break;
                case 2:
                    System.out.print("\nHaving Fun!");
                    break;
                default:
                    System.out.print("\nWRONG OPTION!");
            }
        } while (option != 2);
        
        return 0;
    }
        
    public static void extractLargestAndSmallestYingL
        (int[] ary1, int[] ary2)
    {
        int[] result1;
        int[] result2;
        
        result1 = getLargest(ary1, ary2);
        result2 = getSmallest(ary1, ary2);
        
        for (int i = 0; i < result1.length; i++)
            System.out.print(result1[i] + " ");
        
        for (int i = 0; i < result2.length; i++)
                System.out.print(result2[i] + " ");
    }
    
    public static int[] getLargest(int[] ary1, int[] ary2)
    {
        int[] resultAry1 = null;
        int largest;
        int count = 0;
        int aryIndexFlag = 0;
        
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
                if (ary1[i] == largest)
                    aryIndexFlag = 1;
        }
        
        for (int i = 0; i < ary2.length; i++)
        {
            if (count != 2)
                if (ary2[i] == largest)
                    aryIndexFlag = 2;
        }
        
        resultAry1 = new int[1 + 1 +
                ((aryIndexFlag != 0)? 1 : 2)];
        
        resultAry1[0] = largest;
        resultAry1[1] = count;
        if (count == 2)
        {
            resultAry1[2] = 1;
            resultAry1[3] = 2;
        } else {
            resultAry1[2] = aryIndexFlag;
        }
        
        return resultAry1;
    }
    
    public static int[] getSmallest(int[] ary1, int[] ary2)
    {
        int[] resultAry2 = null;
        int smallest;
        int count = 0;
        int aryIndexFlag = 0;
        
        smallest = ary2[0];
        for (int i = 1; i < ary1.length; i++)
        {
            if (smallest > ary1[i])
                smallest = ary1[i];
        }
        
        for (int i = 0; i < ary2.length; i++)
        {
            if (smallest > ary2[i])
                smallest = ary2[i];
        }
        
        for (int i = 0; i < ary1.length; i++)
        {
            if (ary1[i] == smallest)
            {
                count++;
                
                i = ary1.length;
            }
        }
        
        for (int i = 0; i < ary2.length; i++)
        {
            if (ary2[i] == smallest)
            {
                count++;
                
                i = ary2.length;
            } 
        }
        
        for (int i = 0; i < ary1.length; i++)
        {
            if (count != 2)
                if (ary1[i] == smallest)
                    aryIndexFlag = 1;
        }
        
        for (int i = 0; i < ary2.length; i++)
        {
            if (count != 2)
                if (ary2[i] == smallest)
                    aryIndexFlag = 2;
        }
        
        resultAry2 = new int[1 + 1 +
                ((aryIndexFlag != 0)? 1 : 2)];
        
        resultAry2[0] = smallest;
        resultAry2[1] = count;
        if (count == 2)
        {
            resultAry2[2] = 1;
            resultAry2[3] = 2;
        } else {
            resultAry2[2] = aryIndexFlag;
        }
        
        return resultAry2;
    }
}

/**Program Output
CIS 36A - Java Programming
Laney College
Ying Hsuen Lin

Assignment Information --
  Assignment Number: Homework 02,
                     Coding Assignment -- Exercise #1
  Written by:        Ying Hsuen Lin
  Due Date:          2019/09/17


************************************************
*                     MENU                     *
* (1) Calling extractLargestAndSmallestYingL() *
* (2) Quit                                     *
************************************************
Enter your option (1 or 2): 1

Building the first array -
  Enter the array size: 5
  Enter the array element values -
    Index 0: -15
    Index 1: 450
    Index 2: 63
    Index 3: -9
    Index 4: 90

Building the second array -
  Enter the array size: 6
  Enter the array element values -
    Index 0: 100
    Index 1: -151
    Index 2: 450
    Index 3: 6
    Index 4: -91
    Index 5: 9

Calling extractLargestAndSmallestYingL() --

After finishing the call, the returning array -

450 2 1 2 -151 1 2 


************************************************
*                     MENU                     *
* (1) Calling extractLargestAndSmallestYingL() *
* (2) Quit                                     *
************************************************
Enter your option (1 or 2): 3

WRONG OPTION!


************************************************
*                     MENU                     *
* (1) Calling extractLargestAndSmallestYingL() *
* (2) Quit                                     *
************************************************
Enter your option (1 or 2): 1

Building the first array -
  Enter the array size: 7
  Enter the array element values -
    Index 0: 15
    Index 1: 450
    Index 2: 63
    Index 3: -900
    Index 4: 90
    Index 5: -900
    Index 6: 90

Building the second array -
  Enter the array size: 6
  Enter the array element values -
    Index 0: 100
    Index 1: -151
    Index 2: 4500
    Index 3: 6
    Index 4: -91
    Index 5: 9

Calling extractLargestAndSmallestYingL() --

After finishing the call, the returning array -

4500 1 2 -900 1 1 


************************************************
*                     MENU                     *
* (1) Calling extractLargestAndSmallestYingL() *
* (2) Quit                                     *
************************************************
Enter your option (1 or 2): 2

Having Fun!
 */

/**Logic Code Output Issues
 * No comment!
 */