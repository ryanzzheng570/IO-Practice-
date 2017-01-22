import java.util.*;
public class CountD
{
    public static boolean isNum(char l)
    {
        boolean isNum = false;
        if(Character.isDigit(l))
            isNum = true;
        return isNum;
    }
    
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Please enter a sentense: ");
        String sen = ip.nextLine();
       
        int count = 0;
        
        for(int i=0; i< sen.length(); i++)
        {
            if(isNum(sen.charAt(i))==true)
            count++;
        }
        
        System.out.println("There is " + count + " numbers of digit in the string");
    }
}
            