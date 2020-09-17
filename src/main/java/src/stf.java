/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author manpretsingh
 */
public class stf implements Comparable<stf>
{
    int count;
    char ch;
    public stf(int count,char ch)
    {
        this.ch=ch;
        this.count=count;
        
    }

    @Override
    public int compareTo(stf arg0) 
    {
        if(this.count>arg0.count){
        return 1;
    }
        else if(this.count<arg0.count){
            return -1;
        }
        else{
            return 0;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public String toString()
    {
       return ""+ch+"--> "+count+" ";  
    }
}
