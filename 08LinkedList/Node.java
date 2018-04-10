public class Node {
    Node Next;
    Node Prev; 
    Integer data;
    

    public Node (Node a, Node b , Integer c) {
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

    public Integer getValue() 
    {
	return data; 
    }
    
    public void setValue(Integer a) 
    {
	data = a; 
    }

    public String toString() 
    {
	String dump = "";
	return dump + data;
    }
}
