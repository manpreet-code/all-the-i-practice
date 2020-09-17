import java.util.Scanner;
import java.lang.Math;
public class isprime {
    static boolean checkprime(int n){
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
               }}return true;}
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x= s.nextInt();
        int sum=0;
        if(checkprime(x)){
            for(int i=2;;i++ ){
                if(checkprime(i)){
                    sum=sum+i;
                    if(x==sum){
                        System.out.println("is consecutive");
                        break;
                    }
                    if(x-sum<0){
                        System.out.println("is not consecutive");
                        break;
                    }
                }
               
            }
        }
        else
        {
            System.out.println("The number entered is not prime");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
