
package dsalgo;


public class stack {
    int a[];
    int top;
    public stack(){
        a= new int [5];
        top=-1;
    }
    public void push(int n){
        if(top<=a.length-1){
        top++;
        a[top]=n;
    }
        else{
            System.out.println("stack is full");
        }}
        public  void pop(){
            if(top>-1){
            int temp;
            temp=a[top];
            top--;
                System.out.println(temp+" its out of stack now");
            }
            else{
                System.out.println("stack is empty");
        }
        }
            public void peak(){
                System.out.println( a[top]);
                
                
            }

    /**
     *
     * @return
     */

    @Override
            public String toString(){
        String ans="[";
        for(int i=0;i<=top;i++){
            ans=ans+a[i]+" ";
        }
       ans=  ans + "]";
       return ans;
        
                
            
        }
        
        
    
    
    
}
