import java.util.*;

        /*
        OUTPUT: 
        hello -- string
        123   -- int
        98.76 -- double
        */
        

public class Scanner_Demo3 
{
    public static void main(String[] args)
    {
   
        String s = "hello 123 98.76 true world";
       
        Scanner sc=new Scanner(s);
        
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
            {
                int n = sc.nextInt();
                System.out.println(n+ "-- int");
            }
            else if(sc.hasNextDouble())
            {
                double d = sc.nextDouble();
                System.out.println(d+" -- double");
            }
            else if(sc.hasNextBoolean())
            {
                boolean b = sc.nextBoolean();
                System.out.println(b+" -- boolean");
            }
            else
            {
                String p = sc.next();
                System.out.println(p+"-- string");
            }
        }
       
    }
    
}
