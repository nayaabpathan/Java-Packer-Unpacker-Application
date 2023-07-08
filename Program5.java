import java.io.*;
import java.util.*;

import javax.swing.Icon;

import java.nio.charset.StandardCharsets;  

class Program5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");   //Array of Strings
        int iCount= 0;
         
        System.out.println("Enter the Word that you want to search : ");

        String Word  = sobj.nextLine();

        for(int i = 0 ;i< Arr.length;i++)
        {

           if(Arr[i].equals(Word))
           {
              iCount++;
           }
        }
        System.out.println("Frequency of the "+Word+" is : "+iCount);








    } 
}
 
