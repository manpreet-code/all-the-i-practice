import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i =s.nextInt();
        String str=s.next();
        char c = str.charAt(0);
        double hra,da,pf;
        int allow;
        hra = 0.2*i;
        da = 0.5*i;
        pf=0.11*i;
        if(c=='A'){
            allow=1700;
            
            
        }
        else if(c=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        int total=(int) (i+hra+da+allow-pf);
        Math.round(total);
                
        System.out.println(total);
        
    }
}
