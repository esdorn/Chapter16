import java.util.NoSuchElementException;
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList
{
    /** description of instance variable x (add comment for each instance variable) */
    private Node first;
    private Node last;
    class Node
    {
        Object data;
        Node next;
    }
    
    class LinkedListIterator implements ListIterator
    {
        private Node node;
        private Node previous;
        private boolean isAfterNext;
        public LinkedListIterator()
        {
            node = null;
            previous = null;
            isAfterNext = false;
        }
        
        public Object next()
        {
            if (!hasNext()){throw new NoSuchElementException();}
            previous = node;
            isAfterNext = true;
            if (node == null)
                node = first;
            else
                node = node.next;
            return node.data;
        }
        
        public boolean hasNext()
        {
            if (first == null)
                return first != null;
            else
                return node.next != null;
        }
        
        public Object Previous()
        {
            Object data = node.data;
            Node temp = first;
            while (temp.next != node)
            {
                temp = temp.next;
            }
            node = temp;
            return data;
        }
    }
    
    /**
     * Default constructor for objects of class LinkedList
     */
    public LinkedList()
    {
        // initialise instance variables
        first = null;
        last = null;
    }
    
    public void addF(Object data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        if (newNode.next == null)
            last = newNode;
        first = newNode;
    }
    
    public void addL(Object data)
    {
        Node newNode = new Node();
        newNode.data = data;
        Node temp = first;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        last = newNode;
    }
    
    public Object getF()
    {
        if(first == null){throw new NoSuchElementException();}
        return first.data;
    }
    
    public Object getL()
    {
        if(last == null){throw new NoSuchElementException();}
        return last.data;
    }
    
    public Object removeF()
    {
        if(first == null){throw new NoSuchElementException();}
        Object data = first.data;
        first = first.next;
        return data;
    }
    
    public Object removeL()
    {
        if(first == null){throw new NoSuchElementException();}
        Object data = first.data;
        first = first.next;
        return data;
    }
    
    public String toString()
    {
        Node temp = first;
        String s = "{";
        while (temp!=null)
        {
            s+=temp.data+", ";
            temp = temp.next;
        }
        return s.substring(0,s.length()-2)+"}";
    }
    
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
    }
}
