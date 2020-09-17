import java.io.*;
import java.util.*;

public class Scanner_Demo5 
{
    public static void main(String[] args) 
    {
        try
        {
              File f = new File("/Users/Dell/Documents/two.txt");
              
              Scanner sc=new Scanner(f);
              
              while(sc.hasNext())
              {
                  System.out.println(sc.nextLine());
              }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
