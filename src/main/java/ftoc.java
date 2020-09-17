import java.util.Scanner;
public class ftoc {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int s= x.nextInt();
        int e= x.nextInt();
        int w= x.nextInt();
        while(s<=e){
            int c = (int) ((5.0/9)*(s-32)); 
            System.out.print(s );
            System.out.println(" "+c);
            s=s+w;
        }
    }
    
}
