import java.util.Scanner;
public class binary_to_decimal {
  public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int k,ans=0,pv=1;
        while(n!=0){
          k= n%10;
          ans=ans+k*pv;
          pv=pv*2;
          n=n/10;  
}
      System.out.println(ans);}}
