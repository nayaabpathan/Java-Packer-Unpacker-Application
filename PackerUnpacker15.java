import java.io.*;
import java.lang.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.tools.FileObject;

class PackerUnpacker15
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a folder Name : ");

        String FileName = sobj.nextLine();
        int iRet = 0;
    
        try{
        File fobj = new File(FileName);

        if(fobj.exists())
        {
            File allFiles[] = fobj.listFiles();
            
            System.out.println("File Length is : "+allFiles.length);
            
             System.out.println("File name are : ");

             System.out.println("-----------------------------------------------------");
            for(int i = 0;i<allFiles.length;i++)
            {
                System.err.println("Files Names : "+allFiles[i].getName()+"  Size : "+allFiles[i].length());

                FileInputStream fiobj = new FileInputStream(allFiles[i]); 

                byte Buffer[] = new byte[1024];

                while((iRet = fiobj.read(Buffer))!=-1)
                {
                    String str =new String(Buffer,StandardCharsets.UTF_8);
                    System.out.println(str);
                }
                System.out.println("-----------------------------------------------------");

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