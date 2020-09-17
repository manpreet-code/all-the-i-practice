import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x =s.nextInt();
        int y=x;
        int n=s.nextInt();
        int i=0;
        if(n==0){
            System.out.println(1);
        }
        while(i<n-1){
            x=x*y;
            i=i+1;
        }
        System.out.println(x);
    }
}
