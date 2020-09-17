import java.util.*;

public class Scanner_Demo2 
{
    public static void main(String[] args)
    {
   
        String s = "amrinder,mohit,achleshwar,gurkirat,gagan";
        
        Scanner sc=new Scanner( s );
       
        sc.useDelimiter(",");        // use , as seperator
       
        while(sc.hasNext())
        {
            String p = sc.next();
            
            System.out.println(p);
        }
       
    }
    
}
