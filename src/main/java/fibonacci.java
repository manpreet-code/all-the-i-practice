import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1,n2,n3,i;
        n1=0;
        n2=1;
        n3=0;
       for(i=2;i<=n;i++){
           n3=n1+n2;
           n1=n2;
           n2=n3;
       }
        System.out.println(n3);
    }
}
