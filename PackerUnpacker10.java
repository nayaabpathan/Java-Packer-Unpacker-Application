import java.util.*;
import java.nio.file.*;
import java.io.*;

class PackerUnpacker10{

public static void main(String arg[])
{
     Scanner sobj = new Scanner(System.in);


     System.out.println("Enter the Folder Name : ");

     String FileName = sobj.nextLine();
      
     File fobj = new File(FileName);

     boolean bRet = false;
     bRet = fobj.exists();

     if(bRet == false)
     {
         System.out.println("File Does Not Exist  !!!");
         return;
     }

     File allfile[] = fobj.listFiles();
     System.out.println("Number of Files are : "+allfile.length);
     

}

}