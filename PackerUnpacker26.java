import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;  

class PackerUnpacker25
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------------------Marvellous Packer Unpacker CUI Panel---------------");

        try
        {
          

            System.out.println("Enter the name of packed file :  ");
            System.out.println("Note :  Packed file should be in the current directory !!");
            String PackFile = sobj.nextLine();

            File fpackobj = new File(PackFile);
          

            FileInputStream fout = new FileInputStream(fpackobj);

            if(fpackobj.exists())
            {
                System.out.println("Packed File is there.......");

                byte Header[] = new byte[1024];

                while((Ret = fin.read(Header,0,100)) > 0)
                {
                fout.read(Header,0,100);

                String str = new String(Header);

                System.out.println(str);

                String Arr[] = str.split(" ");


                File fobj = new File(Arr[0]);
                fobj.createNewFile();

                int FileSize = Integer.parseInt(Arr[1]);

                byte DataArray[] = new byte[FileSize];

                fout.read(DataArray,0,FileSize);

                FileOutputStream foout = new FileOutputStream(fobj);

                foout.write(DataArray,0,FileSize);

            }
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