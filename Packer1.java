import java.io.*;
import java.util.*;

import javax.swing.Icon;

import java.nio.charset.*;


class Packer1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
      
        try
        {
        System.out.println("Enter the Folder name that contains the packed file....");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        System.out.println("Enter the name of Packed file that you want to create ");
        System.out.println("Note : The created packed file stored in the current directory ");

        System.out.println("File Name is : ");

        String PackedFile = sobj.nextLine();

        File pobj = new File(PackedFile);

        pobj.createNewFile();

        FileOutputStream fout = new FileOutputStream(pobj);

        byte Buffer[] = new byte[1024];
        int iRet = 0, iCnt = 0;



        String name;



        if(fobj.exists())
        {  

         File allfiles[] = fobj.listFiles();


         for(int i = 0;i<allfiles.length;i++)
         {
            name = allfiles[i].getName();

       

            if(name.endsWith(".txt"))
            {
                name = name + " " + allfiles[i].length();

                System.out.println("File names : "+allfiles[i].getName()+" with its length : "+allfiles[i].length());

                for(int j = name.length();j<100;j++)  // Header Format
                {
                     name = name +  " ";
                }

               FileInputStream fin = new FileInputStream(allfiles[i]);

               byte HeaderByte[] = name.getBytes();

               fout.write(HeaderByte,0,HeaderByte.length);

               while((iRet = fin.read(Buffer)) != -1)
               {
                   fout.write(Buffer,0,iRet);
               }

               iCnt++;

            }

         }

         System.out.println("----- Summary -----");
         System.out.println("Number of files scanned : "+allfiles.length);
         System.out.println("Number of files packed succesfully : "+ iCnt);

         System.out.println("Thank you for using Marvellous Packer Unpacker Application");
         
       }
      else
      {  
                System.out.println("There is no such File.........");
      }
                    
    }
           catch(Exception obj)
            {
               System.out.println("Exception Occured..."+obj);
            }
   
    }
}



            
