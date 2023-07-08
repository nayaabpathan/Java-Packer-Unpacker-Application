import java.util.*;
import java.io.*;


class PackerUnpacker3
{
    public static void main(String[] args) throws Exception
    {

        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");

        String Filename = sobj.nextLine();
        
    
        File obj = new File(Filename);

        if(obj.exists())
        {
            System.out.println("File Exists ...");
            System.out.println("Length of the file is  : "+obj.length());
        }
        else
        {
            System.out.println("File does not Exist");
        }



        
    }
}