import java.util.Scanner;
public class sumofevenodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int x,odd,even;
        
        odd=0;
        even=0;
        while(n!=0){
            x=n%10;
            if(x%2==0){
                even=even+x;
            }
            else{
                odd=odd+x;
            }
            n=n/10;}
        
        System.out.println(even+""+odd);
    }
    
}
