import java.io.*;
import java.util.*;

import javax.swing.Icon;

import java.nio.charset.StandardCharsets;  

class Program4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");   //Array of Strings
        int iCount= 0;

        for(int i = 0 ;i< Arr.length;i++)
        {

           if(Arr[i].equals("Demo"))
           {
              iCount++;
           }
        }
        System.out.println("Frequency of Demo word is : "+iCount);








    } 
}
 
