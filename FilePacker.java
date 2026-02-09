import java.io.File;
import java.util.Scanner;
import java.io.FileReader;

class FilePacker
{
    public static void main(String[] A)
    {
        String FolderName = "";
        String PackFileName = "";

        String[] ValidExtension = {".txt", ".java", ".c", ".cpp"};

        boolean bRet = false;

        File DirObj = null;
        File PFileObj = null;

        File[] FileArr = null;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Folder name : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the Pack File name : ");
        PackFileName = sobj.nextLine();

        DirObj = new File(FolderName);

        if(DirObj.exists() && DirObj.isDirectory())
        {
            System.out.println("Folder is present");

            PFileObj = new File(PackFileName);

            bRet = PFileObj.exists();

            if(bRet)
            {
                System.out.println("File is already present");
            }
            else
            {
                try
                {
                    bRet = PFileObj.createNewFile();

                    if(bRet == false)
                    {
                        System.out.println("Unable to create PackFile");
                        return;
                    }
                    else
                    {
                        System.out.println("File gets created sucessfully");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }

            FileArr = DirObj.listFiles();

            /*
            Display All files from Directory

            for(File f : FileArr)
            {
                System.out.println("File Name : "+f.getName());
            }
            */

            System.out.println("Number of Files in Directory : "+FileArr.length);

            for(File f : FileArr)
            {
                System.out.println("File Name : "+ f.getName() + "\t" +"File Size : " + f.length());
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}