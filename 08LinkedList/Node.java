public class Node <T> {
    Node Next;
    Node Prev; 
    T data;
    

    public Node (Node a, Node b , T c) {
	Next = a; 
	Prev = b; 
	data = c; 
    }

    public Node getNext() 
    {
	return Next;
    }
    
    public void setNext(Node a) 
    {
	Next = a; 
    }

    public Node getPrev() 
    {
	return Prev; 
    }
    
    public void setPrev(Node a) 
    {
	Prev = a ; 
    }

    public T getValue() 
    {
	return data; 
    }
    
    public void setValue(T a) 
    {
	data = a; 
    }

    public String toString() 
    {
	String dump = "";
	return dump + data;
    }
}
