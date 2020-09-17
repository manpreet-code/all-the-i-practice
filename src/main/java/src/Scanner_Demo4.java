import java.util.*;

public class Scanner_Demo4
{
    public static void main(String[] args)
    {
   
        String s = "hello world how are you" ;
       
        // Attach Scanner with keyboard
        Scanner sc=new Scanner(System.in);
        
        //String p = sc.nextLine();
        
        //System.out.println(p);
       
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        System.out.println("Cube is "+(n*n*n));
    }
    
}
