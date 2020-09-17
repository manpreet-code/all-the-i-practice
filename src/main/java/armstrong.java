import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int k,count=0,sum=0;
        int temp=n;
        int temp1=n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        
        while(temp1!=0){
            k=temp1%10;
            sum=(int) (sum+ Math.pow(k,count));
           temp1 =temp1/10;
            
        }
       
       
        if(sum==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
 
}
