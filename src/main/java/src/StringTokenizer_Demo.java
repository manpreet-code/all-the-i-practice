import java.util.*;

public class StringTokenizer_Demo 
{
    public static void main(String[] args) {
        
         String s = "hello,world how,are you";
       
         StringTokenizer st=new StringTokenizer(s ,", ");  // use , as seperator
        
         int n = st.countTokens() ;
        
         for(int i=1;i<=n;i++)
         {
             String p = st.nextToken();
             
             System.out.println(p+"*");
         }
         
         /*
         while(st.hasMoreTokens())
         {
             String p = st.nextToken();
             
             System.out.println(p+"*");
         }
         */
         
    }
    
}
