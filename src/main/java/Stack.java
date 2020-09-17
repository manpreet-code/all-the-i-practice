public class Stack<T> {
    Node head;
    int size;
	
	public Stack() 
    {
        head=null;
        size=0;

	}
	
	public int size() 
    {
        return size;

	}
	
	public void push(T data) 
    {
        if(isEmpty())
        {
        Node <T> temp=new Node<>(data);
            head=temp;
             size++;
        }
        else
        {
             Node <T> temp=new Node<>(data);
            temp.next=head;
            head=temp;
            size++;
        }
        

	}
	
	public boolean isEmpty()
    {
        if(head==null)
        {
            
            return true;
        }
        
        else
        {
            return false;
        }

	}
	
	public T pop() throws StackEmptyException 
    { 
        if(!isEmpty())
        {
          if(head.next==null)
          {
               size--;
             return (T)head.data; 
              
          } 
            else
            {
               T temp= (T)head.data;
                head=head.next;
                 size--;
                return temp;
            }
        }else{
            StackEmptyException e =new StackEmptyException();
            throw e;
        }
        
       
	}
	
	public T top() throws StackEmptyException {
        
        
         if(!isEmpty())
        {
               T temp= (T) head.data;
                //head=head.next;
                 size--;
                 return temp;
         }else{
             StackEmptyException e =new StackEmptyException();
            throw e;
         }

	}
}
