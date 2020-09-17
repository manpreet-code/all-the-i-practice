import java.util.Scanner;
public class patten {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int x=1 ;
        int i = 1;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space=space+1;
                
            }
            
            
            int j =1;
            
            while(j<=x){
                
                System.out.print("*");
               
                j=j+1;}
                x=x+2;
            
            System.out.println();
            i=i+1;
        }
    }
}
