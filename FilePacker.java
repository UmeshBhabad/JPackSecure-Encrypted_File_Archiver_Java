// Final code of File Packer

import java.io.*;
import java.util.*;

class FilePacker
{
    public static void main(String A[]) throws Exception                                            // Main Method
    {
        // Encryption Key
        byte Key = 0x11;

        // Local Variable
        String Header = null;                                                                       
        
        int iRet = 0;
        int i = 0, j = 0;

        byte Buffer[] = new byte[1024];
        byte bHeader[] = new byte[100];

        String FolderName = null;
        String PackName = null;

        // File class Object
        File fobj = null;
        File PackObj = null;

        // FileOutputStream class object
        FileOutputStream foobj = null;

        // FileInputStream Class object
        FileInputStream fiobj = null;

        // Scanner class object
        Scanner sobj = new Scanner(System.in);

        // Accept Folder name
        System.out.println("Enter the name of folder :");
        FolderName = sobj.nextLine();

        // Accept File name
        System.out.println("Enter the name of file :");
        PackName = sobj.nextLine();

        fobj = new File(FolderName);                                                                // Object Instantiation

        if(fobj.exists() && fobj.isDirectory())     // Directory present
        {
            PackObj = new File(PackName);                                                           // Object Instantiation

            PackObj.createNewFile();                                                                // Create new file

            foobj = new FileOutputStream(PackObj);                                                  // object Instantiation

            System.out.println("Folder is present.");

            File fArr[] = fobj.listFiles();                                                         // Array of files

            System.out.println("Number of files in the folder are : "+fArr.length);                 // Display Array length()
            
            // 
            for(i = 0; i < fArr.length; i++)    // traverse throuth directory
            {
                fiobj = new FileInputStream(fArr[i]);                                               // Object Instantiation

                if (fArr[i].getName().endsWith(".txt"))     // .txt files
                {
                    // Header formation
                    Header = fArr[i].getName() + " "+ fArr[i].length();                             // File Header

                    for (j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }

                    bHeader = Header.getBytes();                                                    // String into byte

                    // Write header into pack file
                    foobj.write(bHeader, 0,100);                                                    // write Header into pack file

                    // Read the data from the input files from Marvellous folder
                    while((iRet = fiobj.read(Buffer)) != -1)    // read data from file
                    {
                        // Encryption logic
                        for(j = 0; j < iRet; j++)
                        {
                            Buffer[j] = (byte)(Buffer[j] ^ Key);
                        }

                        // Write the file data into pack file
                        foobj.write(Buffer, 0, iRet);
                    }   
                }
                
                fiobj.close();
            }
            foobj.close();
        }
        else        // Directory Absent
        {
            System.out.println("There is no such folder.");
        }
        sobj.close();        
    }
}