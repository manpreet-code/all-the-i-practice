import java.util.*;

public class Scanner_Demo1 
{
    public static void main(String[] args)
    {
   
        String s = "hello    world    how     are     you";
        
        Scanner sc=new Scanner( s );
        
        String ans="";
        int count=0;
        
        while(sc.hasNext())
        {
            String p = sc.next() ;
            
            count++;
            
            ans=ans+p+" ";
        }
        
        System.out.println(ans);
        System.out.println(count+" words");
    }
    
}
