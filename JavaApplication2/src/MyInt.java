/**
 * Program Name: MyInt.java
 * Discussion:   Tesing Point
 * Written By:   Ying Hsuen Lin
 * Date:         2019/10/10
 */

import java.util.*;

public class MyInt 
{
    public int data; //data member
    
    public void displayData() //there is an object reference
                              //parameter by the name of 'this'
    {
        int data = 0;
        System.out.println("\nLocal variable named as data : " + 
                data + "\nThe data member by the name of 'data' : " +
                this.data);
                //data);
    }
    //public int data;
}
