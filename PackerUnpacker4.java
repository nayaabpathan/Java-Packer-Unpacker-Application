import java.util.*;
import java.io.*;


class PackerUnpacker4
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
           BufferedReader bobj = new BufferedReader(new FileReader(obj));
           Byte booByte= new Byte([80]);
           String Data;
           while((Data = bobj.readLine()) != null)
           {
              System.out.println("Data present in the file is : "+Data);
            
           }
        }
        else
        {
            System.out.println("File does not Exist");
        }



        
    }
}