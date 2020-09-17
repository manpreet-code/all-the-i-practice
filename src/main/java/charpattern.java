import java.util.Scanner;
public class charpattern {


	public static void main(String[] args) {
		
		        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int y=n-1;
        int x;
        int i = 1;
        while(i<=n){
        int j =1;
      x=y;
            while(j<=i){
             
                System.out.print((char)('A'+x));
        x=x+1;
                j=j+1;
            }
            y=y-1;
            System.out.println();
            i=i+1;
        }
    }
}





