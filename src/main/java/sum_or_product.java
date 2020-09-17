import java.util.Scanner;
public class sum_or_product {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int d =s.nextInt();
        int sum,pro;
        sum=0;
        pro=1;
         if(d==1){
        for(int i=0; i<=n;i++ ){
            
                sum=sum+i;}
                System.out.println(sum);
            
         }
         
            else if(d==2){
             for(int i=1; i<=n;i++ ){
                 pro=pro*i;}
                 System.out.println(pro);
            
        }
            else{
                System.out.println(-1);
            }
    }
}
