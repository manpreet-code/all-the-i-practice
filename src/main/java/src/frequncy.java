/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author manpretsingh
 */
public class frequncy {
   
    public static void main(String[] args) 
    {
        frequencyOfChars("hello world how are you");
    }
    
    static void frequencyOfChars(String s)
    {
        
        ArrayList <stf>AL=new ArrayList<>();
         int i,j,k;
         int flag=0;
         
         char ch;   
    
         for(i=0;i<s.length();i++)
         {
             ch=s.charAt(i);
             
             // Backward to check if ch is not already counted
             flag=0;
             for(k=i-1;k>=0;k--)
             {
                 if(ch==s.charAt(k))
                 {
                    flag=1;
                    break;
                 }
             }
             
             if(flag==0)  // NOT Already Counted, FWD LOOP
             {
                 int count = 1;
                 
                 for(j=i+1;j<=s.length()-1;j++)
                 {
                     if(s.charAt(j)==ch)
                     {
                         count++;
                     }
                 }
                 
              AL.add(new stf (count,ch));
             }
         }
             Collections.sort(AL);
             System.out.println(AL);
             
         }
         
    
    
    }
    


    

