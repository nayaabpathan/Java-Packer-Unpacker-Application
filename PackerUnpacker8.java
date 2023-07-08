import java.util.*;
import java.io.*;
import java.text.BreakIterator;


 class PackerUnpacker8 {

    public static void main(String argsp[]) 
    {
       Scanner sobj = new Scanner(System.in);
       
       try{
       System.out.println("Enter the Source File name : ");
       String Source = sobj.nextLine();

       System.out.println("Enter the Dest File name : ");
       String Destination = sobj.nextLine();

       File fsource = new File(Source);
       File fdest = new File(Destination);

       boolean bRet =  fsource.exists();
       if(bRet == false)
       {
        System.out.println("Source File is not Existing !!!");
        return;
       }
       bRet = fdest.createNewFile();
       if(bRet == false)
       {
         System.out.println("Unable to Create !!");
         return;
       }
       

       FileInputStream Iobj = new FileInputStream(fsource);
       FileOutputStream Oobj = new FileOutputStream(fdest);

       byte Buffer[] = new byte[1024];
          
       int iRet = 0;
       while((iRet = Iobj.read(Buffer)) != -1)
       {
         
         Oobj.write(Buffer);
       }

       }
       catch(Exception obj)
       { 
        System.out.println("Exception Occured : "+obj);
       }        
    }
    
}
