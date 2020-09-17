import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int k,rev=0;
        while(n!=0){
          k= n%10;
          n=n/10;
          rev=rev*10+k;
          
           
        }
        System.out.println(rev);
    }
}
