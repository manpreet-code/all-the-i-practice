/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo;

/**
//// *
 * @author manpretsingh
 */
public class main {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.pop();
        s.peak();
        System.out.println(s);
        
    }
    
}
