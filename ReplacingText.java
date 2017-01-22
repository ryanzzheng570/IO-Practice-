import java.io.*;
import java.util.*;
public class ReplacingText
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("cloud_backup.txt"); //Defind the file       
        File nFile = new File("cloud_backup_new.txt"); //Defind the new file
        
        if(!file.exists()) //If the file donesn't exist, exit the program
        {
            System.out.println("Can't find the file, please put under the directory.");
            System.exit(0);
        }
        
        Scanner ip = new Scanner(file);              
        PrintWriter pw = new PrintWriter(nFile);
        
        if(!nFile.exists()) //If nFile doesn't exist, create the file
        {
            nFile.createNewFile();
        }
        
        while(ip.hasNext()) //Loop each line, put the changed line and original line to the new file
        {   
            String line = ip.nextLine();
            String line1 = line.replace("hard disk", "HDD");
            pw.println(line1);
        }
        pw.close();
    }
}