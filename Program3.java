import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;  

class Program3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");   //Array of Strings


        System.out.println("Numbers of Words are : "+Arr.length);


        int max = 0;
        int iNo = 0;

        for(int i = 0 ;i< Arr.length;i++)
        {

          if(max < Arr[i].length())
          {
            max = Arr[i].length();
            iNo = i;
          }

        }
        System.out.println("Largest name in the string is : " +Arr[iNo] +" With the length : "+Arr[iNo].length());








    } 
}
 
