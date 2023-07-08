import java.util.*;
import java.io.*;


class PackerUnpacker2
{
    public static void main(String[] args) throws Exception
    {

        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");

        String Filename = sobj.nextLine();
        
        System.out.println("File name is : "+Filename);

        File obj = new File(Filename);

        bRet = obj.createNewFile();
        if(bRet == true)
        System.out.println("File created successfully...");
        else
        System.err.println("Unable to Open File");




        
    }
}