import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;  

class MarvellousPacker
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------------------Marvellous Packer Unpacker CUI Panel---------------");

        try
        {
            System.out.println("Enter folder name which contains a file which you want pack : ");
            String FolderName = sobj.nextLine();

            File fobj = new File(FolderName);

            System.out.println("Enter the name of packed file that you want to create :  ");
            System.out.println("Note :  Packed file gets stored automatically in current directory !!");
            String PackFile = sobj.nextLine();

            File fpackobj = new File(PackFile);
            fpackobj.createNewFile();

            FileOutputStream fout = new FileOutputStream(fpackobj);

            if(fobj.exists())
            {
                File allfiles[] = fobj.listFiles();

                System.out.println("Number of files are : "+allfiles.length);

                System.out.println("File names are : ");
                int count= 0;

                byte Buffer[] = new byte[1024];

                int ret = 0;
                String name;

                for(int i = 0; i< allfiles.length; i++)
                {
                    name = allfiles[i].getName(); 

                     
                     if(name.endsWith(".txt"))
                     {
                         
                        System.out.println("Header  : "+name+" With Length "+name.length());

                        for(int j  = name.length();j<100;j++)
                         {
                          
                            name = name + " ";
                
                         }  

                        byte HeaderByte[]  = name.getBytes();        //String to byte array conversion

                        fout.write(HeaderByte,0,HeaderByte.length); //Write Header in Packer

                        FileInputStream fiobj = new FileInputStream(allfiles[i]);

                         while((ret = fiobj.read(Buffer)) != -1)
                         {
                            fout.write(Buffer,0,ret);
                         }
                         count++;
                   }
                }

                System.out.println("-----------Summary---------");
                System.out.println("Number of files Scanned : "+allfiles.length);
                System.out.println("Number of file packed Successfully "+count);
            }
            else
            {
                System.out.println("There is no such folder..");
            }

        }// End of try
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+obj);
        }
    } //end of main
}   // end of class