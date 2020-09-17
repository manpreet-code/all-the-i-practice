import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i-1;j++){
                System.out.print(0);
                
            }
            System.out.print("*");
           
            for(int g=1;g<=n-i;g++){
                System.out.print(0);
                
            }
            System.out.print("*");
            for(int g=1;g<=n-i;g++){
                System.out.print(0);
                
            }
            System.out.print("*");
            for(int j=1;j<=i-1;j++){
                System.out.print(0);
                
            }
            
            System.out.println("");
        }
        
    }
   
}
