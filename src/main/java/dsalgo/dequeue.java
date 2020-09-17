/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo;

/**
 *
 * @author manpretsingh
 */
public class dequeue {
    int a[];
    int f,r,m;
     
    dequeue(){
        a=new int[5];
        m=(a.length-1)/2;
        f=-1;
        r=-1;
    }
    boolean isemty(){
        if(f==-1){
            return true;
        }
        return false;
        
    }
    void addfromfront(int n){
        if(f==-1&&r==-1){
            f=m;
            r=m;
            a[f]=n;   
        }
        else{
            
        }
        
    }
    
}
