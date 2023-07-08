import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;  

class Program2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = sobj.nextLine();

        String Arr[] = str.split(" ");   //Array of Strings


        System.out.println("Numbers of Words are : "+Arr.length);

        System.out.println("Words from the strings are : ");

        for(int i = 0 ;i< Arr.length;i++)
        {

            System.out.println(Arr[i] +"  " +Arr[i].length());
        }








    } 
}
