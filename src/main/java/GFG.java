import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void rotate (int arr[],int size,int rot){
        
        
        
        
        
        for(int j=0;j<size;j++){
                 System.out.println(arr[j]);
                    
                }
        
        
        
    }
	public static void main (String[] args) {
            Scanner s=new Scanner(System.in);
            int x= s.nextInt();
            for(int i=0;i<x;i++){
                int size= s.nextInt();
                int rot=s.nextInt();
                int arr[]=new int[size];
                for(int j=0;j<size;j++){
                    arr[j]=s.nextInt();
                    
                }
                rotate(arr,size,rot);
                
            }
	    
		//code
	}
}