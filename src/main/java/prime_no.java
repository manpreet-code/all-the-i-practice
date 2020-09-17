import java.util.Scanner;
public class prime_no {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        int i,j;
        
        for(i=2;i<=n;i++){
           int count =1;
            
           for(j=2;j<=i/2;j++){
                if(i%j==0){
             count=0;
                }
           }
            if(count==1){
                System.out.println(i);
            }
        }}
    }

