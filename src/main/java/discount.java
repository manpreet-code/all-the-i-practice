import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mill=s.nextInt();
        int hand=s.nextInt();
        double dis1=0.0,dis2=0.0;
        if(mill<=100&& mill>=0){
            dis1=0;
        }
        if(mill<=200&& mill>=101){
            dis1=0.05*mill;
        }
        if(mill<=300&& mill>=201){
            dis1=0.075*mill;;
        }
        if(mill>300){
            dis1=0.1*mill;;
        }
        if(hand<=100&& hand>=0){
            dis2=0.05*hand;
        }
         if(hand<=200&& hand>=101){
            dis2=0.075*hand;
        }
         if(hand<=300&& hand>=201){
            dis2=0.1*hand;
        }
         if(hand>300){
            dis2=0.15*hand;
        }
         double total=mill-dis1+hand-dis2;
         System.out.println("total is "+total);
         
    }
    
}
