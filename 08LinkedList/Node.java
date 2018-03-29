public class Node {
    Node Next;
    Node Prev; 
    int data;
    

    public Node (Node a, Node b , int c) {
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

    public int getValue() 
    {
	return data; 
    }
    
    public void setValue(int a) 
    {
	data = a; 
    }

    public String toString() 
    {
	String dump = "";
	return dump + data;
    }
}
