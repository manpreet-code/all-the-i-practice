import java.util.Scanner;
public class terms_of_ap {
    public static void main(String[] args) {
         Scanner s  = new Scanner(System.in);
        int x = s.nextInt();
        int sum=0;
                    int count=0;
        for(int i=1;i<=10;i++ ){
            sum=3*i+2;
            if(sum%4==0){
                continue;
            }
            System.out.println(sum);
            count++;
            if(count==x){
                break;
            }
        }
    }
    
}
