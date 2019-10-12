/**
 * Program Name: Cis36aFall2019YingLHw3Ex1.java
 * Discussion:   Hw #3, Ex #1
 * Written By:   Ying Hsuen Lin
 * Date:         2019/10/15
 */

import java.util.*;

public class Cis36aFall2019YingLHw3Ex1 
{
    public static void main(String[] arg)
    {
        System.out.print("CIS 36A - Java Programming" +
                "\nLaney College" +
                "\nYing Hsuen Lin" +
                "\n\nAssignment Information --" +
                "\n  Assignment Number: Homework 03," +
                "\n                     " +
                "Coding Assignment -- Exercise #1" +
                "\n  Written by:        Ying Hsuen Lin" +
                "\n  Due Date:          2019/10/15");
		
        runMenu();
    }
    
    public static int runMenu()
    {
        int option;
        Fraction3YingL[] obj = new Fraction3YingL[3];
        Scanner scanner = new Scanner(System.in);
        
        do
        {
            System.out.print(
                    "\n\n\n****************************************" +
                    "\n*            MENU - HW #3              *" +
                    "\n* (1) Creating 2 Fraction3 Objects     *" +
                    "\n* (2) Performing Arithmetic Operations *" +
                    "\n* (3) Displaying Fraction3 Objects     *" +
                    "\n* (4) Quit                             *" +
                    "\n****************************************" +
                    "\nEnter your option (1 through 4): ");
            option = scanner.nextInt();
            
            switch (option)
            {
                case 1:
                    obj = create2FraObj(obj);
                    
                    break;
                case 2:
                    performArithOperation(obj);
                    
                    break;
                case 3:
                    printTwoFra(obj);
                    
                    break;
                case 4:
                    System.out.print("\nHaving Fun!");
                    break;
                default:
                    System.out.print("\nYou are funny!");
            }
        } while (option != 4);
        
        return 0;
    }
    
    public static Fraction3YingL[] create2FraObj(Fraction3YingL[] fr)
    {
        int s1;
        int s2;
        int n1;
        int n2;
        int d1;
        int d2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nsign: ");
        s1 = scanner.nextInt();
        System.out.print("\nnumerator: ");
        n1 = scanner.nextInt();
        System.out.print("\ndenominator: ");
        d1 = scanner.nextInt();
        
        fr[0] = new Fraction3YingL(s1, n1, d1);
        
        System.out.print("\nsign: ");
        s2 = scanner.nextInt();
        System.out.print("\nnumerator: ");
        n2 = scanner.nextInt();
        System.out.print("\ndenominator: ");
        d2 = scanner.nextInt();
        
        fr[1] = new Fraction3YingL(s2, n2, d2);
        
        if (fr[2] == null)
        {
            fr[2] = new Fraction3YingL();
        }
        return new Fraction3YingL[]{fr[0], fr[1], fr[2]} ;
    }
    
    public static void performArithOperation
        (Fraction3YingL[] fr)
    {
        int option;
        Scanner scanner = new Scanner(System.in);
        
        do
        {
            System.out.print(
                    "\n\n\n********************************" +
                    "\n*  Make The Entered Fractions  *" +
                    "\n* (1) Add                      *" +
                    "\n* (2) Subtract                 *" +
                    "\n* (3) Multiply                 *" +
                    "\n* (4) Divide                   *" +
                    "\n* (5) Quit                     *" +
                    "\n********************************" +
                    "\nEnter your option (1 through 5): ");
            option = scanner.nextInt();
            
            switch (option)
            {
                case 1:
                    fr[2] = fr[0].add(fr[1]);
                    fr[2].print();
                    break;
                case 2:
                    fr[2] = fr[0].sub(fr[1]);
                    fr[2].print();
                    break;
                case 3:
                    fr[2] = fr[0].mul(fr[1]);
                    fr[2].print();
                    break;
                case 4:
                    fr[2] = fr[0].div(fr[1]);
                    fr[2].print();
                    break;
                case 5:
                    System.out.print("\nHaving Fun!");
                    break;
                default:
                    System.out.print("\nYou are funny!");
            }
        } while (option != 5);
    }
        
    public static void printTwoFra(Fraction3YingL[] fr)
    {
        fr[0].print();
        fr[1].print();
    }
}

/**Program Output

 */

/**Logic Code Output Issues
 * 
 */