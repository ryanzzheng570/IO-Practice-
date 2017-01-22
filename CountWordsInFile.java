import java.io.*;
import java.util.*;
public class CountWordsInFile
{
    public static int countWord(String sen)
    {
        int words = 1; //Don't cound the last word that have period
        sen = sen.trim();
        for(int i=0; i<sen.length(); i++)
        {
            if(sen.substring(i, i+1).equals(" ") && !sen.substring(i+1, i+2).equals(" "))
            {
                words++;
            }
        }
        return words;
    }
    
    public static void main(String[] args) throws Exception
    {
        Scanner ip = new Scanner(System.in); 
        System.out.print("Please enter the file name: ");
        String fileName = ip.nextLine();
        
        File file = new File(fileName); //Create the file
        
        if(file.exists())
        {
            Scanner ip2 = new Scanner(file); //Create a Scanner to check the file
            int sum=0; //The total word in each line
            while(ip2.hasNext())
            {               
               sum+= countWord(ip2.nextLine());
            }
            System.out.println("There are " + sum + " words in the file.");
            ip2.close();
        }
        else
        {
            System.out.println("The file doesn't exists");
        }
    }
}