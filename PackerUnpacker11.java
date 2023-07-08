import java.io.*;
import java.lang.*;
import java.util.Scanner;

import javax.tools.FileObject;

class PackerUnpacker11
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a folder Name : ");

        String FileName = sobj.nextLine();
    
        try{
        File fobj = new File(FileName);

        if(fobj.exists())
        {
            File allFiles[] = fobj.listFiles();
            
            System.out.println("File Length is : "+allFiles.length);

            for(int i = 0;i<allFiles.length;i++)
            {
                System.err.println("Files are : "+allFiles[i].getName());
            }


        }
        else
        {
            System.out.println("File does Not Exist !!!!");
        }
    }
    catch(Exception obj)
    {
     System.out.println("Exception Occured : "+obj);
    }
    }
}