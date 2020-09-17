import java.util.Scanner;
public class twod_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rows,colum,sum=0;
        rows=s.nextInt();
        colum=s.nextInt();
        int arr2d[][]=new int[rows][colum];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colum;j++){
              arr2d[i][j]=s.nextInt();
              sum=sum+arr2d[i][j];
            }
            System.out.println(sum+" ");
        }
    }
    
}
